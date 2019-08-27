package com.example.number_service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;


public class Print  {
  /*  int i=0;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Create", Toast.LENGTH_LONG).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Started", Toast.LENGTH_LONG).show();


                for ( i = 1; i <= 100; i++) {
                    try {
                        Thread.sleep(1000);
                        MainActivity.getInstance().getTxtid().append("number:" + i + "\n");

                    } catch (Exception e) {
                        Log.e("Execption", e.getMessage());
                    }
                }

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Destory", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }*/
}
