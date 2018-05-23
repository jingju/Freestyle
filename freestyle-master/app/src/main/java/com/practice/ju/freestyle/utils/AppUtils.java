package com.practice.ju.freestyle.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by guangju on 2018/5/23.
 */

public class AppUtils {
    public static void startActivity(Context context, Class clazz){
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);

    }
}
