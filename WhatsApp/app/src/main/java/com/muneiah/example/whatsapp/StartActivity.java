package com.muneiah.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
Button mRegButton,mLogin_AlreadyAcct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mRegButton=findViewById(R.id.button_reg);
        mLogin_AlreadyAcct=findViewById(R.id.button_alredy_acct);
        mLogin_AlreadyAcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        mRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(reg_intent);
            }
        });
    }
}
