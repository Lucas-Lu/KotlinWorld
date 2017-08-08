package com.sleepsmart.luliju.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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

        Button Btnswitch = (Button) findViewById(R.id.Switch);

        Btnswitch.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(v.getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
