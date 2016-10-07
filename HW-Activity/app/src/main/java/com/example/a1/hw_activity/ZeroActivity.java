package com.example.a1.hw_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ZeroActivity extends AppCompatActivity {

    boolean flag;
    Intent intent;
    private String key = "key";
    private String save="save";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        flag = getApplicationContext().getSharedPreferences(save, MODE_PRIVATE).getBoolean(key, false);
        if (flag) {
            intent = new Intent(this, MainActivity.class);
        } else {
            intent = new Intent(this, FirstActivity.class);
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
