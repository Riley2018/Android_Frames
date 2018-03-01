package com.riley.qin.android_frames.main.fragment;


import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.riley.qin.android_frames.R;
import com.riley.qin.android_frames.common.butterknife.ButterknifeActivity;
import com.riley.qin.android_frames.main.adapter.CommonFragmentAdapter;
import com.riley.qin.android_frames.main.base.BaseFragment;

/**
 * 常用
 */
public class CommonFragment extends BaseFragment {
    private static final String TAG = CommonFragment.class.getSimpleName();

    private ListView mListView;
    private TextView mTitle;
    private String[] datas;
    private CommonFragmentAdapter mAdapter;

    @Override
    protected View initView() {
        Log.e(TAG, "CommonFragment初始化...");
        View view = View.inflate(mContext, R.layout.fragment_common, null);
        mListView = view.findViewById(R.id.list_view);
        mTitle = view.findViewById(R.id.tv_title);
        return view;
    }

    @Override
    protected void initData() {
        super.initData();
        mTitle.setText("Riley.Qin's Common Frames");
        datas = new String[]{"Butterknife","OKHttp", "Glide", "..."};
        mAdapter = new CommonFragmentAdapter(mContext, datas);
        mListView.setAdapter(mAdapter);
    }

    @Override
    protected void initListener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = datas[position];
                if(data.equals("Butterknife")){
                    Intent intent = new Intent(mContext, ButterknifeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
