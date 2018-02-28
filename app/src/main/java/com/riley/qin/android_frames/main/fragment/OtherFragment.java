package com.riley.qin.android_frames.main.fragment;


import android.util.Log;
import android.view.View;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 其他
 */
public class OtherFragment extends BaseFragment {
    private static final String TAG = OtherFragment.class.getSimpleName();

    @Override
    protected View initView() {
        Log.e(TAG, "OtherFragment初始化...");
        return View.inflate(mContext, R.layout.fragment_other, null);
    }
}
