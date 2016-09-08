package com.example.michal.mybodyandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.michal.mybodyandroidapp.model.Body;
import com.example.michal.mybodyandroidapp.model.BodyHistory;

public class AddBodyDimensionsActivity extends AppCompatActivity {
    BodyHistory bodyHistory;

    private double height;
    private double weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_body_dimenssions);

        bodyHistory = new BodyHistory();

        if(savedInstanceState != null){
            height = savedInstanceState.getDouble("height");
            weight = savedInstanceState.getDouble("weight");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putDouble("height", height);
        savedInstanceState.putDouble("weight", weight);
    }

    public void onClickAddBody(View view){
        EditText givenHeight = (EditText) findViewById(R.id.heightEditText);
        EditText givenWeight = (EditText) findViewById(R.id.weightEditText);

        if(givenHeight.getText().length() > 0){
            height = Double.parseDouble(givenHeight.getText().toString());
        } else {
            height = 170.0;
        }

        if(givenWeight.getText().length() > 0){
            weight = Double.parseDouble(givenWeight.getText().toString());
        }


        Body body = new Body(height, weight);

        bodyHistory.addBodyToBodyHistory(body);
        System.out.println(bodyHistory.toString());
    }

}
