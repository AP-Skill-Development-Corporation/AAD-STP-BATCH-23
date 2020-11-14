package com.muneiah.example.mysharedprefarences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,pass;
String myName,myPass;
SharedPreferences sp;
SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et_name);
        pass=findViewById(R.id.et_pwd);
        sp=getSharedPreferences("apssdc",MODE_PRIVATE);
    }

    public void showData(View view) {
        myName=name.getText().toString();
        myPass=pass.getText().toString();
        /*Toast.makeText(this, "hello"+myName+"\n"+myPass, Toast.LENGTH_SHORT).show();*/
        editor=sp.edit();
        editor.putString("n",myName);
        editor.putString("p",myPass);
        editor.apply();
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        myName=name.getText().toString();
        myPass=pass.getText().toString();
        /*Toast.makeText(this, "hello"+myName+"\n"+myPass, Toast.LENGTH_SHORT).show();*/
        editor=sp.edit();
        editor.putString("n",myName);
        editor.putString("p",myPass);
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        String nn=sp.getString("n","");
        String pp=sp.getString("p","");
        name.setText(nn);
        pass.setText(pp);
    }
}