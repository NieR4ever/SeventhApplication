package com.haetae.seventhapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class NetConnectReceiver extends BroadcastReceiver {
    final static String TAG = "haetaedebug";

    @Override
    public void onReceive(Context context, Intent intent) {
//        if (intent.getType().equals(ConnectivityManager.TYPE_WIFI)) {
//            Log.d(TAG, "网络链接成功");
//        } else {
//            Log.d(TAG, "网络断开链接");
//        }
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        if (isConnected) {
            Log.d(TAG, "网络链接成功");
        } else {
            Log.d(TAG, "网络断开链接");
        }
    }
}
