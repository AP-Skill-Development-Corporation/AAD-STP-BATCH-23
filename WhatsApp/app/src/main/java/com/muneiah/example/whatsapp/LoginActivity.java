package com.muneiah.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
private Toolbar mToolBa_login;
private TextInputLayout mLogin_email;
private TextInputLayout mLogin_pass;
private Button mLogin_button;
private ProgressDialog mLoginProgressDilog;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        mLoginProgressDilog=new ProgressDialog(this);
        mLogin_button=findViewById(R.id.button_llogin_id);
        /*mToolBa_login=findViewById(R.id.login_page_toolbar);*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Login");
        mLogin_email=findViewById(R.id.login_email_textInputLayout);
        mLogin_pass=findViewById(R.id.login_pass_textInputLayout3);
        mLogin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String login_mail=mLogin_email.getEditText().toString();
            String login_password=mLogin_email.getEditText().toString();
            if (!TextUtils.isEmpty(login_mail) || !TextUtils.isEmpty(login_password)){
                mLoginProgressDilog.setTitle("Logging In");
                mLoginProgressDilog.setMessage("Please Wait we check your credentials .");
                mLoginProgressDilog.setCanceledOnTouchOutside(true);
                mLoginProgressDilog.show();
                loginUser(login_mail,login_password);


                }
            else{
                Toast.makeText(LoginActivity.this, "Please fill the details ", Toast.LENGTH_SHORT).show();
            }


            }
        });

    }

    private void loginUser(String login_mail, String login_password) {
        mAuth.signInWithEmailAndPassword(login_mail,login_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    mLoginProgressDilog.dismiss();

                    Intent mainIntent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(mainIntent);
                    finish();
                }else{

                        mLoginProgressDilog.hide();
                        Toast.makeText(LoginActivity.this, "Cann't sign in .Please Please check the form and try again ", Toast.LENGTH_SHORT).show();

                }
            }
        });
       /* mAuth.signInWithEmailAndPassword(login_mail,login_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                  if (task.isSuccessful()){
                       mLoginProgressDilog.dismiss();

                      Intent mainIntent=new Intent(LoginActivity.this,MainActivity.class);
                      startActivity(mainIntent);
                      finish();
                  }
                  else {
                      mLoginProgressDilog.hide();
                      Toast.makeText(LoginActivity.this, "Cann't sign in .Please Please check the form and try again ", Toast.LENGTH_SHORT).show();
                  }
            }
        });*/
    }
}
