package com.example.a1.hw_activity;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class FifthActivity extends AppCompatActivity {
    private String key="key";
    private String save="save";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    public void onClickStartMainActivity (View v)
    {
        getApplicationContext().getSharedPreferences(save, MODE_PRIVATE).edit().putBoolean(key, true).commit();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
