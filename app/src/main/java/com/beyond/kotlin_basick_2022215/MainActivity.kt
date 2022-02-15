package com.beyond.kotlin_basick_2022215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Userage : Any





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView라는 기능을 수행, R.layout.activity_main을 쓰겟다고



        btnLog.setOnClickListener {
            //kotlin extension 활용, but 폐기예정
            //중괄호 vs 그냥 괄호
            //로그는 개발자 로직 체크용

            Log.d("메인 화면","Log 눌림")
            Log.wtf("로그 wtf", "이게 나오네")
            Log.e("아", "에러임을 알려주는 에러 로그")

        }
        btnToast.setOnClickListener {
            //kotlin extension 활용, but 폐기예정
            //중괄호 vs 그냥 괄호

            Toast.makeText(this, "토스트메세지", Toast.LENGTH_LONG).show()

        }

        btnVar.setOnClickListener {
            //변수 연습

            val choi = "최재훈"
            val d = 10

            Toast.makeText(this, "$choi $d", Toast.LENGTH_SHORT).show()

            

        }

        btnCondition.setOnClickListener {
            //조건문 연습

           val Userage = 10


            if(Userage >= 20 ){

                Toast.makeText(this, "당신은 성인이시군요", Toast.LENGTH_SHORT).show()

            }

            else if(Userage >= 17 ){

                Toast.makeText(this, "당신은 고등학생이시군요", Toast.LENGTH_SHORT).show()

            }

            else if(Userage >= 13 ){

                Toast.makeText(this, "당신은 중학생이시군요", Toast.LENGTH_SHORT).show()

            }

            else if(Userage >= 8 ){

                Toast.makeText(this, "당신은 초등학생이시군요", Toast.LENGTH_SHORT).show()

            }

            else{

                Toast.makeText(this, "학교를 못가셨군요", Toast.LENGTH_SHORT).show()

            }

        }

    }
}