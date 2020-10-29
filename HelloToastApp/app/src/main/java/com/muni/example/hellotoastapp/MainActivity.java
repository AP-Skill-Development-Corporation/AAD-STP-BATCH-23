package com.muni.example.hellotoastapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_data;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_data=findViewById(R.id.tv);
       if (savedInstanceState!=null&& savedInstanceState.containsKey("key")){
           count=savedInstanceState.getInt("key");
           tv_data.setText(String.valueOf(count));
       }
    }

    public void showToast(View view) {
        Toast.makeText(this, "welcome to android world", Toast.LENGTH_SHORT).show();
    }

    public void increseCount(View view) {
        count++;
        tv_data.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key",count);
    }
}