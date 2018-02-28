package com.riley.qin.android_frames.main.fragment;


import android.view.View;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 常用
 */
public class CommonFragment extends BaseFragment
{

    @Override
    protected View initView()
    {
        return View.inflate(mContext, R.layout.fragment_common,null);
    }

    @Override
    protected void initData()
    {
        super.initData();
    }
}
