package com.example.question_1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    class MyBinder extends Binder {
        public void fun() {
            Log.d("MyService.MyBinder", "fun executed");
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        MyBinder myBinder = new MyBinder();
        return myBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("MyService", "onUnbind executed");
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService", "onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "onStartCommand executed");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService", "onDestroy executed");
    }
}