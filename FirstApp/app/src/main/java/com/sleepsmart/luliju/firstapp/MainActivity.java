package com.sleepsmart.luliju.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        Btnswitch.setOnClickListener(listener);
        Intent intent = new Intent();
        intent.setClass(this, LoginActivity.class);
        startActivity(intent);

    }

    Button.OnClickListener listener = new Button.OnClickListener(){//创建监听对象
        public void onClick(){
            String strTmp="点击Button02";
        }

    };

}
