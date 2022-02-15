package com.beyond.kotlin_basick_2022215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView라는 기능을 수행, R.layout.activity_main을 쓰겟다고


            var k = findViewById<Button>(R.id.btnLog)

            k.setOnClickListener {

                Log.d("","")

            }

    }
}