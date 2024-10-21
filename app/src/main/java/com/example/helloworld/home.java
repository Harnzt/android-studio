package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openMain(View view) {
        Intent testIntent = new Intent(this, MainActivity.class);
        startActivity(testIntent);
    }

    public void openscrolling(View view) {
        Intent intentScrolling = new Intent(this, scrolling_text.class);
        startActivity(intentScrolling);
    }

    public void toastView(View view) {
        Intent intentScrolling = new Intent(this, omke_gams.class);
        startActivity(intentScrolling);
    }

    public void mainView(View view) {
        Intent intentScrolling = new Intent(this, MainActivity.class);
        startActivity(intentScrolling);
    }
}