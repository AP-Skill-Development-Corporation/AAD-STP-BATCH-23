package com.muneiah.example.jobschedular;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    JobScheduler js;
    ComponentName cn;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        js= (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
        cn=new ComponentName(getPackageName(),MyJobService.class.getName());
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void showSchedule(View view) {
        JobInfo.Builder builder=new JobInfo.Builder(232,cn);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        builder.setRequiresCharging(true);
        JobInfo jobInfo=builder.build();
        js.schedule(jobInfo);
    }
}