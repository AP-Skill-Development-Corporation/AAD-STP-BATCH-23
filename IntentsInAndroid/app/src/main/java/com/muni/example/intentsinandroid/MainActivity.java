package com.muni.example.intentsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et_obj;
    String myName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_obj=findViewById(R.id.et_name);
    }

    public void showSecondActivity(View view) {
         myName=et_obj.getText().toString();
        Intent intentObj=new Intent(this,SecondActivity.class);
        /*passing data between two activitys through intent object */
        intentObj.putExtra("apssdc",myName);
        startActivity(intentObj);
    }

    public void showWebPage(View view) {
        myName=et_obj.getText().toString();
        Uri u=Uri.parse("https://www."+myName+".in");
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}