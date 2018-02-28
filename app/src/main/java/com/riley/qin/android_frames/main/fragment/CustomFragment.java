package com.riley.qin.android_frames.main.fragment;


import android.util.Log;
import android.view.View;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 自定义
 */
public class CustomFragment extends BaseFragment {
    private static final String TAG = CustomFragment.class.getSimpleName();

    @Override
    protected View initView() {
        Log.e(TAG, "CustomFragment初始化...");
        return View.inflate(mContext, R.layout.fragment_custom, null);
    }

}
