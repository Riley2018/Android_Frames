package com.riley.qin.android_frames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.riley.qin.android_frames.main.activity.MainActivity;

public class LauncherActivity extends Activity
{

    private static final String TAG = "LauncherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        findViewById(R.id.iv_logo).postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startMainActivity();
                Log.e(TAG, Thread.currentThread().getName());
            }
        }, 200);
    }

    private void startMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
