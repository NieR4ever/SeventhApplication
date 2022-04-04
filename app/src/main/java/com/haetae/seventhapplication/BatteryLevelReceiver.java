package com.haetae.seventhapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.ParcelUuid;
import android.util.Log;

public class BatteryLevelReceiver extends BroadcastReceiver {
    final static String TAG = "haetaedebug";

    @Override
    public void onReceive(Context context, Intent intent) {

        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        if (status ==  BatteryManager.BATTERY_STATUS_CHARGING) {
            Log.d(TAG, "正在充电");
        } else if (intent.getAction().equals(Intent.ACTION_BATTERY_OKAY)) {
            Log.d(TAG, "离开电量底");
        } else if (intent.getAction().equals(Intent.ACTION_BATTERY_LOW)){
            Log.d(TAG, "电量低");
        }
    }
}
