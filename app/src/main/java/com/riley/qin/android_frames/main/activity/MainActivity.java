package com.riley.qin.android_frames.main.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;
import com.riley.qin.android_frames.main.fragment.CommonFragment;
import com.riley.qin.android_frames.main.fragment.CustomFragment;
import com.riley.qin.android_frames.main.fragment.OtherFragment;
import com.riley.qin.android_frames.main.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private RadioGroup mRadioGroup;
    private List<BaseFragment> mBaseFragments;
    private int position;
    private BaseFragment mContentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initFragment();

        initListener();
    }

    private void initView() {
        mRadioGroup = findViewById(R.id.radio_group);
    }

    private void initFragment() {
        mBaseFragments = new ArrayList<>();
        mBaseFragments.add(new CommonFragment());
        mBaseFragments.add(new ThirdFragment());
        mBaseFragments.add(new CustomFragment());
        mBaseFragments.add(new OtherFragment());
    }

    private void initListener() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_btn_common:
                        position = 0;
                        break;
                    case R.id.radio_btn_third:
                        position = 1;
                        break;
                    case R.id.radio_btn_custom:
                        position = 2;
                        break;
                    case R.id.radio_btn_other:
                        position = 3;
                        break;
                    default:
                        position = 0;
                        break;
                }
                BaseFragment showFragment = getFragment();
                switchFragment(mContentFragment, showFragment);
            }
        });
        mRadioGroup.check(R.id.radio_btn_common);
    }

    private BaseFragment getFragment() {
        return mBaseFragments.get(position);
    }

    private void switchFragment(BaseFragment currentFragment, BaseFragment showFragment) {
        if (currentFragment != showFragment) {
            mContentFragment = showFragment;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (!showFragment.isAdded()) {
                //添加
                if (null != currentFragment) {
                    transaction.hide(currentFragment);
                }
                if (null != showFragment) {
                    transaction.add(R.id.fl_container, showFragment).commit();
                }
            } else {
                //显示
                if (null != currentFragment) {
                    transaction.hide(currentFragment);
                }
                if (null != showFragment) {
                    transaction.show(showFragment).commit();
                }
            }
        }
    }
}
