package com.example.chen.bughddemo;

import android.app.Application;

import im.fir.sdk.FIR;

public class MyApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        FIR.init(this);
    }
}