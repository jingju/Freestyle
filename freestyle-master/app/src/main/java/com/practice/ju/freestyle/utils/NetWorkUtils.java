package com.practice.ju.freestyle.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.practice.ju.freestyle.R;

/**
 * Created by guangju on 2018/5/24.
 */

public class NetWorkUtils {
    public static final String TAG = "Basic Network Demo";
    // Whether there is a Wi-Fi connection.
    private static boolean wifiConnected = false;
    // Whether there is a mobile connection.
    private static boolean mobileConnected = false;

    private void checkNetworkConnection(Context context) {

        // BEGIN_INCLUDE(connect)
        ConnectivityManager connMgr =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
        if (activeInfo != null && activeInfo.isConnected()) {
            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            if (wifiConnected) {
                Log.i(TAG, "wifi connection");
            } else if (mobileConnected) {
                Log.i(TAG, "mobile connection ");
            }
        } else {
            Log.i(TAG, "既不是wifi 也不是网络");
        }
        // END_INCLUDE(connect)
    }
}
