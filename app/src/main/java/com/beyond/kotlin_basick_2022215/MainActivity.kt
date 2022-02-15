package com.beyond.kotlin_basick_2022215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView라는 기능을 수행, R.layout.activity_main을 쓰겟다고



        btnLog.setOnClickListener {
            //kotlin extension 활용, but 폐기예정
            //중괄호 vs 그냥 괄호
            //로그는 개발자 로직 체크용

            Log.d("메인 화면","Log 눌림")
            Log.wtf("썅", "이게 나오네")
            Log.e("아", "에러임을 알려주는 에러 로그")

        }
        btnToast.setOnClickListener {
            //kotlin extension 활용, but 폐기예정
            //중괄호 vs 그냥 괄호

            Toast.makeText(this, "토스트메세지", Toast.LENGTH_LONG).show()

        }

        btnVar.setOnClickListener {
            //변수 연습

            

        }

    }
}