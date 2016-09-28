package com.lljackie.test2_logcat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 正常来说仅仅写几行log应该不会有什么问题，但是我用真机在测试的时候却只显示了worning和error，
 * 我反复摆弄Android Studio后排除是AS本身的问题的可能，后来在网上查了查资料，
 * 网上大神解释说安卓机如果刷第三方rom包的话，设计者为了提升性能会完全或部分地关闭log日志，
 * 而我的真机正是刷过第三方rom包，很有可能是这个问题导致的log不显示。
 * 后来我借了个原装系统的手机测试可正常显示所有log日志，证实猜想。
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a Verbose Message");
        Log.d(TAG, "This is a Debug Message");
        Log.i(TAG, "This is an Info Message");
        Log.w(TAG, "This is a Warning Message");
        Log.e(TAG, "This is an Error Message");


    }
}
