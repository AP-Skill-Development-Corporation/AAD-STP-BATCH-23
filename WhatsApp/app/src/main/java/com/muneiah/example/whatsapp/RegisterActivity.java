package com.muneiah.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {
private TextInputLayout mUserName;
private TextInputLayout mEmail;
private TextInputLayout mPassword;
private Button mCreateAccount_btn;
    private FirebaseAuth mAuth;
    private Toolbar mTbar;
    private ProgressDialog mRegProgressDilog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        mRegProgressDilog=new ProgressDialog(this);

        mTbar=findViewById(R.id.reg_app_bar_id);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create Account");
        // Initialize Firebase Auth

        mEmail=findViewById(R.id.email_textInputLayout);
        mPassword=findViewById(R.id.password_textInputLayout3);
        mUserName=findViewById(R.id.name_textInputLayout);
        mCreateAccount_btn=findViewById(R.id.create_btn_id);
        mCreateAccount_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display_name=mUserName.getEditText().getText().toString();
                String dis_email=mEmail.getEditText().getText().toString();
                String disp_password=mPassword.getEditText().getText().toString();

                if(!TextUtils.isEmpty(display_name) || !TextUtils.isEmpty(dis_email) || !TextUtils.isEmpty(disp_password)){
                   mRegProgressDilog.setTitle("Registering User ");
                   mRegProgressDilog.setMessage("Please wait while we create your account ");
                   mRegProgressDilog.setCanceledOnTouchOutside(true);
                   mRegProgressDilog.show();
//                       #multiplier Ai
                    register_user(display_name,dis_email,disp_password);
                }





            }
        });
    }

    private void register_user(final String display_name, String dis_email, String disp_password) {
       mAuth.createUserWithEmailAndPassword(dis_email,disp_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){
                   mRegProgressDilog.dismiss();
                   Toast.makeText(RegisterActivity.this,display_name+ " is Registered success", Toast.LENGTH_SHORT).show();
                   Intent mailIntent=new Intent(RegisterActivity.this,MainActivity.class);
                   startActivity(mailIntent);
                   finish();
               }else{
                   mRegProgressDilog.hide();
                   Toast.makeText(RegisterActivity.this, "Cann't register .Please Please check the form and try again", Toast.LENGTH_SHORT).show();
               }
           }
       });
    }
}
