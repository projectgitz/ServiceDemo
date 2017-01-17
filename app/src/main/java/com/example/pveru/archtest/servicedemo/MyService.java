package com.example.pveru.archtest.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = MyService.class.getSimpleName();

    public class MyBinder extends Binder {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate().....called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand().....called");
        return START_STICKY;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        Log.d(TAG, "onTaskRemoved().....called");
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy().....called");
        super.onDestroy();
    }
}
