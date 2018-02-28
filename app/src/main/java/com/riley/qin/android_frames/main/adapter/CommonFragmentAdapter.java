package com.riley.qin.android_frames.main.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CommonFragmentAdapter extends BaseAdapter {

    private String[] mDatas;
    private Context mContext;

    public CommonFragmentAdapter(Context mContext, String[] mDatas) {
        this.mContext = mContext;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setText(mDatas[position]);
        textView.setTextColor(Color.rgb(183, 147, 100));
        textView.setTextSize(20);
        textView.setPadding(20, 20, 0, 20);
        return textView;
    }
}
