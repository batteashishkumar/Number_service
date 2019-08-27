package com.example.number_service;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class CountService extends IntentService {
    public CountService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent( Intent intent) {

        Toast.makeText(this,"Started",Toast.LENGTH_LONG).show();
        for (int i=1;i<=1000;i++)
        {
            MainActivity.getInstance().getTxtid().append("number:"+i+"\n");
            //wait10();
        }


    }

    public void wait10()
    {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
