package com.example.testmasha;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Main1Activity extends AppCompatActivity {
    Button button, button3, wrNo,button8,button7,button5,button2;
    ViewGroup toContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        button = findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        wrNo = findViewById(R.id.writingNo);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        button5 = findViewById(R.id.button5);
        toContainer=findViewById(R.id.transitionContainer);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wrNo.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("Quntity",50);
                startActivity(intent);

            }
        });
        wrNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("Start",10);
                intent.putExtra("Quntity",10);
                startActivity(intent);


            }
        });

            }
        }

