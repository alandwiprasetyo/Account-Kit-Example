package com.alandwiprasetyo.accountkitfacebook;

import android.app.Application;

import com.facebook.accountkit.AccountKit;


/**
 * Created by alandwiprasetyo on 11/25/16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AccountKit.initialize(this);
    }
}
