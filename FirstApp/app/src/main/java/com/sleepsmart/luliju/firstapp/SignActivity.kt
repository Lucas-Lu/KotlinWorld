package com.sleepsmart.luliju.firstapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        textUserName.text = "Alulu"
        switchAct.setOnClickListener(View.OnClickListener {
            fun onClick(v: View) {
                // TODO Auto-generated method stub
                val intent = Intent()
                intent.setClass(v.context, SettingsActivity::class.java)
                startActivity(intent)
            }
        })
    }


}
