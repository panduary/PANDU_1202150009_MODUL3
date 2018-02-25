package com.example.ZWEI.panduarywijaya_1202150009_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "PANDU ARY 1202150009", Toast.LENGTH_SHORT).show();
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(1000L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, Login.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}

