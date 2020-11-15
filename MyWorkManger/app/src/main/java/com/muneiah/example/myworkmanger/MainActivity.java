package com.muneiah.example.myworkmanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
/*
NotificationManager nm;
*/
OneTimeWorkRequest oneTime;
PeriodicWorkRequest secondTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createChannel();*/
        oneTime=new OneTimeWorkRequest.Builder(FirstWork.class).build();
        secondTime=new PeriodicWorkRequest.Builder(SecondWork.class,15, TimeUnit.MINUTES).build();
    }

    /*private void createChannel() {
        if (android.os.Build.VERSION.SDK_INT >=android.os.Build.VERSION_CODES.O){
            NotificationChannel nc=new NotificationChannel("muni","Apssdc",NotificationManager.IMPORTANCE_HIGH);
            nc.setLightColor(Color.BLUE);
            nm.createNotificationChannel(nc);
        }

    }
*/
    public void showNotification(View view) {
        WorkManager.getInstance(this).enqueue(oneTime);
        WorkManager.getInstance(this).enqueue(secondTime);
        /*icon,text,msg*/
        /*NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"muni");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentText("This is our notification");
        builder.setContentTitle("WorkManger With Notification");
        nm.notify(23676,builder.build());*/
    }
}