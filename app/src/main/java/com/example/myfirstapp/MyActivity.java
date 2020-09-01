package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ImageButton BlueButton = (ImageButton) findViewById(R.id.imageButton1);
        BlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.blue);
            }
        });

        ImageButton GreenButton = (ImageButton) findViewById(R.id.imageButton2);
        GreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.green);
            }
        });

        ImageButton OrangeButton = (ImageButton) findViewById(R.id.imageButton3);
        OrangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.orange);
            }
        });

        ImageButton PurpleButton = (ImageButton) findViewById(R.id.imageButton4);
        PurpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.purple);
            }
        });

        ImageButton RedButton = (ImageButton) findViewById(R.id.imageButton5);
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.red);
            }
        });

        ImageButton YellowButton = (ImageButton) findViewById(R.id.imageButton6);
        YellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.yellow);
            }
        });

    }

}