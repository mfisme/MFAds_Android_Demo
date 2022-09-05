package com.mfads.demo;


import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.dqd.smarttool.R;
import com.mfutils.model.LogoSetting;

public class SplashLogoActivity extends BaseActivity {

    FrameLayout adContainer;

    LogoSetting logoSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全屏设置
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        setContentView(R.layout.activity_splash_logo);

        adContainer = findViewById(R.id.adContainer);

        EasyADController adController = new EasyADController(this);

        logoSetting = new LogoSetting.Builder()
                .withLogoRes(R.mipmap.ic_launcher_round)
                .withLogoBgColor(R.color.blue)
                .withLogoText("123321")
                .build();

        adController.loadSplashWithLogo(adContainer, logoSetting, true, new EasyADController.SplashCallBack() {
            @Override
            public void jumpMain() {
                goToMainActivity();
            }
        });
    }

    /**
     * 跳转到主页面
     */
    private void goToMainActivity() {
        startActivity(new Intent(this, SplashToMainActivity.class));
        this.finish();
    }
}