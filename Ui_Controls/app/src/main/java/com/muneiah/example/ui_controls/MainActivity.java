package com.muneiah.example.ui_controls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;

import com.muneiah.example.ui_controls.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
String gender;
String lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.male.isChecked()){
                    gender="Male";
                }else {
                    gender="Female";
                }
                if (binding.telugu.isChecked()){
                    lang="Telugu\t";
                }if (binding.eng.isChecked()){
                    lang=lang+"English\t";
                }
                if (binding.hi.isChecked()){
                    lang=lang+"Hindi";
                }
                binding.tv.setText(binding.etUname.getText().toString()+"\n"+
                        binding.etMobile.getText().toString()+"\n"+
                        binding.etEmail.getText().toString()+"\n"+
                        gender+"\n"+
                        binding.spin.getSelectedItem().toString()+"\n"+
                        lang

                        );
            }
        });
        binding.rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                binding.tv.setText(String.valueOf("your rating is :"+rating));
            }
        });
        binding.sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                binding.tv.setText(String.valueOf("your Progress is "+progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}