package com.muneiah.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_label=findViewById(R.id.tv);
        tv_label.append("onCreate()\n");
        Toast.makeText(this, "App is Created", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is created ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv_label.append("onStart()\n");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is Started ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv_label.append("onPause()\n");
        Toast.makeText(this, "App is Paused", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is Paused ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv_label.append("onResume()\n");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is Resumed ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tv_label.append("onStop()");
        Toast.makeText(this, "App is Stopped", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is stopped ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv_label.append("onDestrioy()");
        Toast.makeText(this, "App is Removed", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is Removed ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv_label.append("onRestart()");
        Toast.makeText(this, "App is Restarted", Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Acitivity is Restarted ");
    }
}