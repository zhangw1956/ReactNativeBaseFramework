package com.reactnativebaseframework;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Process;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "ReactNativeBaseFramework";
    }
     @Override
            public void invokeDefaultOnBackPressed() {
                Process.killProcess(Process.myPid());
            }
         @Override
            public void onConfigurationChanged(Configuration newConfig) {
                super.onConfigurationChanged(newConfig);
                Intent intent = new Intent("onConfigurationChanged");
                intent.putExtra("newConfig", newConfig);
                this.sendBroadcast(intent);
            }
}