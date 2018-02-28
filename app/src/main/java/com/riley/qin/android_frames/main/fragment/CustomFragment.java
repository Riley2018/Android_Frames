package com.riley.qin.android_frames.main.fragment;


import android.view.View;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 自定义
 */
public class CustomFragment extends BaseFragment
{
    @Override
    protected View initView()
    {
        return View.inflate(mContext, R.layout.fragment_custom,null);
    }

}
