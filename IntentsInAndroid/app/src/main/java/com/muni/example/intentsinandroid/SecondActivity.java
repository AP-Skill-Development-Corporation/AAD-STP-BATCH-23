package com.muni.example.intentsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView tv_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_data=findViewById(R.id.tv);
        Intent i=getIntent();
        String d=i.getStringExtra("apssdc");
        tv_data.setText(d);

    }
}