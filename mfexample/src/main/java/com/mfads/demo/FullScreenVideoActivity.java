package com.mfads.demo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;

import com.dqd.smarttool.R;
import com.mfads.core.full.MFAdFullScreenVideo;

public class FullScreenVideoActivity extends BaseActivity {
    MFAdFullScreenVideo fullScreenVideo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_video);
    }


    public void loadFull(View view) {
        fullScreenVideo = new EasyADController(this).initFullVideo();
        fullScreenVideo.loadOnly();

    }

    public void showFull(View view) {
        if (fullScreenVideo != null) {
            fullScreenVideo.show();
        } else {
            EasyADController.logAndToast(this, "需要先调用loadOnly()");
        }
    }

    public void loadAndShowFull(View view) {
        new EasyADController(this).initFullVideo().loadAndShow();
    }
}
