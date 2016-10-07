package com.example.a1.hw_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void onClickStartFourthActivity (View v)
    {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}

