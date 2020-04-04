package com.clicks.yogi.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ratingBar = findViewById(R.id.ratings);
    btn = findViewById(R.id.btn);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String total = "Total : " + ratingBar.getNumStars();
            String rate = "Rate : " + ratingBar.getRating();
            Toast.makeText(MainActivity.this, " "+ total + " :: "+ rate, Toast.LENGTH_SHORT).show();
        }
    });
    }
}
