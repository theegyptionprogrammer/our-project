package com.example.ourproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent1 = Intent(this , System::class.java)
        val intent2 = Intent(this , Statistics::class.java)
        setting.setOnClickListener  { startActivity(intent1) }
        statistics.setOnClickListener { startActivity(intent2) }
    }

}
