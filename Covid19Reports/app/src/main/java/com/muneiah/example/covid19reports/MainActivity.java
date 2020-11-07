package com.muneiah.example.covid19reports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.muneiah.example.covid19reports.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        EndPointInterface pointInterface=RetrofitInstance.getCovid19Instance().create(EndPointInterface.class);
        Call<String> c=pointInterface.getData();
        dialog=new ProgressDialog(this);
        dialog.setTitle("Data is Fetching");
        dialog.setMessage("Plase Wait data is loading");
        dialog.show();
        c.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                dialog.dismiss();
               // Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();
                Log.i("ding",response.body());
                try {
                    JSONArray rootary=new JSONArray(response.body());
                    JSONObject firstObj=rootary.getJSONObject(rootary.length()-1);
                    String date=firstObj.getString("Date");
                    String Country=firstObj.getString("Country");
                    String active=firstObj.getString("Active");
                    String Deaths=firstObj.getString("Deaths");
                    String Confirmed=firstObj.getString("Confirmed");
                    String Recovered=firstObj.getString("Recovered");
                    binding.date.setText("Date "+date);
                    binding.country.setText("country  "+Country);
                    binding.active.setText("Active "+active);
                    binding.deaths.setText("Deaths "+Deaths);
                    binding.cnfm.setText("Confirmed "+Confirmed);
                    binding.recovered.setText("Recovered "+Recovered);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong while fetch data", Toast.LENGTH_SHORT).show();
            }
        });
    }

}