package com.example.examplenotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void notify(View view) {
        createNotification();
        sendNotification();
    }

    private void sendNotification() {
        NotificationCompat.Builder builder=new NotificationCompat.Builder
                (this,"Demo");
        Intent i=new Intent(this,MainActivity.class);

        PendingIntent pi= PendingIntent.getActivity(this,0,i,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentTitle("Notification");
        builder.setContentText("this is my notification");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setContentIntent(pi);
        manager.notify(0,builder.build());

    }

    private void createNotification() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel= new NotificationChannel("Demo","vara",
                    NotificationManager.IMPORTANCE_HIGH);
                    channel.enableVibration(true);
                    channel.enableLights(true);
                    channel.setLightColor(Color.RED);
                    manager.createNotificationChannel(channel);

        }
    }
}