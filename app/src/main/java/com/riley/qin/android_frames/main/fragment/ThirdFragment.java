package com.riley.qin.android_frames.main.fragment;


import android.util.Log;
import android.view.View;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 第三方
 */
public class ThirdFragment extends BaseFragment {
    private static final String TAG = ThirdFragment.class.getSimpleName();

    @Override
    protected View initView() {
        Log.e(TAG, "ThirdFragment初始化...");
        return View.inflate(mContext, R.layout.fragment_third, null);
    }
}
