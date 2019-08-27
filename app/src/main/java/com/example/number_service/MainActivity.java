package com.example.number_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static MainActivity x;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
//        txt=findViewById(R.id.txt);
//        x=this;
//        txt.setMovementMethod(new ScrollingMovementMethod());
    }
   /* public void start(View v){


        Intent i=new Intent(this,Print.class);
        startService(i);
    }
    public void stop(View v){
        Intent i=new Intent(this,Print.class);
        stopService(i);
    }
    public static MainActivity getInstance() { return x; }
    public TextView getTxtid(){ return txt; }
    public void wait10()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

}
