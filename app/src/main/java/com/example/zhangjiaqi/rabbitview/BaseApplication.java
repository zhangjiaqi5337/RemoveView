package com.example.zhangjiaqi.rabbitview;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhangjiaqi on 16/5/18.
 */
public class BaseApplication extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
    public static Context getContext(){
        return context;
    }
}
