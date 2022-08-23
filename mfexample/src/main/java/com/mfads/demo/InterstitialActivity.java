package com.mfads.demo;

import android.os.Bundle;
import android.view.View;

import com.dqd.smarttool.R;
import com.mfads.core.inter.MFAdInterstitial;

public class InterstitialActivity extends BaseActivity {
    MFAdInterstitial interstitialAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

    }

    public void loadAd(View view) {
        interstitialAD = new EasyADController(this).initInterstitial();
        interstitialAD.loadOnly();
    }

    public void showAd(View view) {
        if (interstitialAD != null) {
            interstitialAD.show();
        } else {
            EasyADController.logAndToast(this, "需要先调用loadOnly()");
        }
    }

    public void loadAndShowAd(View view) {
        new EasyADController(this).initInterstitial().loadAndShow();
    }
}
