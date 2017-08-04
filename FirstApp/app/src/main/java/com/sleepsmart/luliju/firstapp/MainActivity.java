package com.sleepsmart.luliju.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView testText = (TextView) findViewById(R.id.editText);
        testText.setText(
                "TTT"
        );

        Intent intent = new Intent();
        intent.setClass(this, Main2Activity.class);
        startActivity(intent);

    }
}
