package com.example.michal.mybodyandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGoToAddBodyActivity(View view) {
        Intent addBody = new Intent(MainActivity.this, AddBodyDimenssionsActivity.class);
        startActivity(addBody);
    }

    public void goToShowGraphActivity(View view) {
        Intent showGraph = new Intent(MainActivity.this, BodyGraphActivity.class);
        startActivity(showGraph);
    }
}
