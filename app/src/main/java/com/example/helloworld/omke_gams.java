package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class omke_gams extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omke_gams);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    
    public void showToast (View view) {
        Toast toast = Toast.makeText( this, R.string.toast, Toast.LENGTH_SHORT);
        toast.show();
    }
    
    public void countUp (View view) {
        ++mCount;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}