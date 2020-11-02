package com.muneiah.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
private androidx.appcompat.widget.Toolbar mToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        mToolBar=findViewById(R.id.main_page_toolbar);
        getSupportActionBar().setTitle("Howdy App");
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){

            Intent start_activity=new Intent(this,StartActivity.class);
            startActivity(start_activity);
            finish();
           sendToStart();
        }
    }

    private void sendToStart() {
        Intent start_activity=new Intent(this,StartActivity.class);
        startActivity(start_activity);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.logout_id){
            FirebaseAuth.getInstance().signOut();
            sendToStart();
        }
        return super.onOptionsItemSelected(item);

        //return true;
    }
}
