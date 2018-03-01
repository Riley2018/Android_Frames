package com.riley.qin.android_frames.common.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.riley.qin.android_frames.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterknifeActivity extends Activity
{
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);

        initView();

        initData();
    }

    protected void initView()
    {
        ivBack.setVisibility(View.VISIBLE);
    }

    protected void initData()
    {
        tvTitle.setText(R.string.butterknife);
    }

    @OnClick({R.id.iv_back, R.id.btn_click})
    public void onViewClicked(View view)
    {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.btn_click:
                Toast.makeText(this, getString(R.string.butterknife), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
