package com.mfads.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.dqd.smarttool.R;


public class NativeExpressActivity extends BaseActivity {
    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_express);
        container = findViewById(R.id.native_express_container);

        new EasyADController(this).loadNativeExpress(container);
    }

    public void loadNEAD(View view) {
        new EasyADController(this).loadNativeExpress(container);
    }
}
