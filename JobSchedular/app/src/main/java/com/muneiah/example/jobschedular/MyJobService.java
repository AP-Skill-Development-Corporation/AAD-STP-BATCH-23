package com.muneiah.example.jobschedular;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MyJobService extends JobService {
    public MyJobService() {
    }

    @Override
    public boolean onStartJob(JobParameters params) {
        Toast.makeText(this, "job is done", Toast.LENGTH_SHORT).show();
        Log.i("JobService","job is done");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Toast.makeText(this, "job isn't done", Toast.LENGTH_SHORT).show();
        return false;
    }


}
