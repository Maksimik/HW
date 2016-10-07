package com.example.a1.hw_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void onClickStartFifthActivity (View v)
    {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
}
