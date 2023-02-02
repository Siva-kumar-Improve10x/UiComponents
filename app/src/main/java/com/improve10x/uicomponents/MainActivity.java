package com.improve10x.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button seekbarBtn;
    Button ratingBarBtn;
    Button datePickerBtn;
    Button timeBtn;
    SeekBar moveSeekbarSb;
    RatingBar ratingBarBr;
    DatePicker dateDp;
    TimePicker timPickerTp;
    Button submitBtn;
    TextView resultTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handleText();
        hideAllComponents();
        handleSeekBtn();
        handleSubmitBtn();
        handleRatingBarBtn();
        handleDatePicker();
        handleTimePicker();
    }

    public void hideAllComponents() {
        moveSeekbarSb.setVisibility(View.GONE);
        ratingBarBr.setVisibility(View.GONE);
        dateDp.setVisibility(View.GONE);
        timPickerTp.setVisibility(View.GONE);
        submitBtn.setVisibility(View.GONE);
        resultTxt.setVisibility(View.GONE);
    }

    public void handleText() {
        submitBtn = findViewById(R.id.submit_btn);
        seekbarBtn = findViewById(R.id.seekbar_btn);
        moveSeekbarSb = findViewById(R.id.moveseekbar_sb);
        resultTxt = findViewById(R.id.result_txt);
        ratingBarBr = findViewById(R.id.ratingbar_rb);
        ratingBarBtn = findViewById(R.id.ratingbar_btn);
        datePickerBtn = findViewById(R.id.datepicker_btn);
        dateDp = findViewById(R.id.date_dp);
        timPickerTp = findViewById(R.id.timpicker_tp);
        timeBtn = findViewById(R.id.time_btn);
    }

    public void handleSeekBtn() {
        seekbarBtn.setOnClickListener(view -> {
            moveSeekbarSb.setVisibility(View.VISIBLE);
            resultTxt.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            ratingBarBr.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
            timPickerTp.setVisibility(View.GONE);
        });
    }

    public void handleRatingBarBtn() {
        ratingBarBtn.setOnClickListener(v -> {
            ratingBarBr.setVisibility(View.VISIBLE);
            resultTxt.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            submitBtn.setVisibility(View.VISIBLE);
            moveSeekbarSb.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
            timPickerTp.setVisibility(View.GONE);
        });
    }

    public void handleDatePicker() {
        datePickerBtn.setOnClickListener(v -> {
            dateDp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            resultTxt.setVisibility(View.VISIBLE);
            moveSeekbarSb.setVisibility(View.GONE);
            ratingBarBr.setVisibility(View.GONE);
            timPickerTp.setVisibility(View.GONE);
        });
    }

    public void handleTimePicker() {
        timeBtn.setOnClickListener(v -> {
            timPickerTp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            resultTxt.setVisibility(View.VISIBLE);
            resultTxt.setText("");
            moveSeekbarSb.setVisibility(View.GONE);
            ratingBarBr.setVisibility(View.GONE);
            dateDp.setVisibility(View.GONE);
        });
    }

    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
            if (moveSeekbarSb.getVisibility() == View.VISIBLE) {
                int progress = moveSeekbarSb.getProgress();
                resultTxt.setText(progress + "");
            }
            if (ratingBarBr.getVisibility() == View.VISIBLE) {
                String rating = String.valueOf(ratingBarBr.getRating());
                resultTxt.setText(rating);
            }
            if (dateDp.isShown() == true) {
                String date = String.valueOf(dateDp.getDayOfMonth());
                String month = String.valueOf(dateDp.getMonth());
                String year = String.valueOf(dateDp.getYear());
                resultTxt.setText(date + "/" + month + "/" + year);
            }
            if (timPickerTp.isShown() == true) {
                String hours = String.valueOf(timPickerTp.getCurrentHour());
                String minutes = String.valueOf(timPickerTp.getCurrentMinute());
                resultTxt.setText(hours + " : " + minutes);
            }
        });
    }
}