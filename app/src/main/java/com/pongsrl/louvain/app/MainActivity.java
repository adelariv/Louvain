package com.pongsrl.louvain.app;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;



import android.annotation.TargetApi;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.util.TypedValue;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Thread logo = new Thread(){
            public void run(){
                try{

                    int tiempo = 0;
                    while(tiempo<1500){
                        sleep(100);
                        tiempo = tiempo + 100;
                    }

                    Intent i = new Intent("com.pongsrl.louvain.app.Principal");
                    startActivity(i);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };

        logo.start();
    }



}