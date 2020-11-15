package com.muneiah.example.myworkmanger;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import static android.content.Context.NOTIFICATION_SERVICE;

public class SecondWork extends Worker {
    NotificationManager nm;

    public SecondWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        nm= (NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
        createChannel();
        showNotiication();
        return Result.success();
    }
    private void createChannel() {
        if (android.os.Build.VERSION.SDK_INT >=android.os.Build.VERSION_CODES.O){
            NotificationChannel nc=new NotificationChannel("muni","Apssdc",NotificationManager.IMPORTANCE_HIGH);
            nc.setLightColor(Color.BLUE);
            nm.createNotificationChannel(nc);
        }

    }
    public void showNotiication(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),"muni");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentText("This is our notification second time");
        builder.setContentTitle("WorkManger With Notification");
        nm.notify(23676,builder.build());
    }

}
