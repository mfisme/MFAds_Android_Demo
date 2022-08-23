package com.mfads.demo;

import android.os.Bundle;
import android.view.View;

import com.dqd.smarttool.R;
import com.mfads.core.reward.MFAdRewardVideo;

public class RewardVideoActivity extends BaseActivity {
    MFAdRewardVideo rewardVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_video);

    }

    public void onLoad(View view) {
        rewardVideo = new EasyADController(this).initReward();
        rewardVideo.loadOnly();

    }

    public void onShow(View view) {
        if (rewardVideo != null) {
            rewardVideo.show();
        } else {
            EasyADController.logAndToast(this, "需要先调用loadOnly()");
        }
    }

    public void loadAndShow(View view) {
        new EasyADController(this).initReward().loadAndShow();
    }
}
