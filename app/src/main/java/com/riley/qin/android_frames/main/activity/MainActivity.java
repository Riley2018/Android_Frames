package com.riley.qin.android_frames.main.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;
import com.riley.qin.android_frames.main.fragment.CommonFragment;
import com.riley.qin.android_frames.main.fragment.CustomFragment;
import com.riley.qin.android_frames.main.fragment.OtherFragment;
import com.riley.qin.android_frames.main.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity
{
    private RadioGroup mRadioGroup;
    private List<BaseFragment> mBaseFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initFragment();
    }

    private void initView()
    {
        mRadioGroup = findViewById(R.id.radio_group);
        mRadioGroup.check(R.id.radio_btn_common);
    }

    private void initFragment()
    {
        mBaseFragments = new ArrayList<>();
        mBaseFragments.add(new CommonFragment());
        mBaseFragments.add(new ThirdFragment());
        mBaseFragments.add(new CustomFragment());
        mBaseFragments.add(new OtherFragment());
    }
}
