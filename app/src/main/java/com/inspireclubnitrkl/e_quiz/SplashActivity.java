package com.inspireclubnitrkl.e_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        getSupportActionBar().hide();

        Thread thread = new Thread(){

            public void run(){
                try {

                    sleep(3000);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {

                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();

                }
            }

        };thread.start();
    }
}