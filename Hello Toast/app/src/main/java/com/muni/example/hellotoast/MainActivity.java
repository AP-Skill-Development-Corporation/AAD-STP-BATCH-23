package com.muni.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_obj;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_obj=findViewById(R.id.tv);
        if (savedInstanceState!=null && savedInstanceState.containsKey("ap")){
            count=savedInstanceState.getInt("ap");
            tv_obj.setText(String.valueOf(count));
        }
    }

    public void showToast(View view) {
       // Toast.makeText(this,"Welcome to android world",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to android world ", Toast.LENGTH_SHORT).show();
    }

    public void increaseTheCount(View view) {
        count++;
        tv_obj.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("ap",count);
    }
}