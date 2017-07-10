package com.wildma.wildmatinker;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.wildma.wildmatinker.tinker.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加载补丁包
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip");
    }

    //Tinker相关配置
    protected void onResume() {
        super.onResume();
        Utils.setBackground(false);

    }

    //Tinker相关配置
    @Override
    protected void onPause() {
        super.onPause();
        Utils.setBackground(true);
    }
}
