package com.sleepsmart.luliju.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        //TextView testText = (TextView) findViewById(R.id.editText);


        Button Btnswitch = (Button) findViewById(R.id.Switch);

        Btnswitch.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(v.getContext(), SignActivity.class);
                startActivity(intent);
            }
        });
    }
}

//<intent-filter>
//<action android:name="android.intent.action.MAIN"/>
//
//<category android:name="android.intent.category.LAUNCHER"/>
//</intent-filter>
