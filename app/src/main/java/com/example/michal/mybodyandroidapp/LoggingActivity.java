package com.example.michal.mybodyandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
    }

    public void onClickLogin(View view){
        Intent addBody = new Intent(LoggingActivity.this, AddBodyDimenssionsActivity.class);
        startActivity(addBody);
    }
}
