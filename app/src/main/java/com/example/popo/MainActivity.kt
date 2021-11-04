package com.example.popo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*
        requestWindowFeature(Window.FEATURE_ACTION_BAR)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar()?.hide()*/

        setContentView(R.layout.activity_main)/*
        ;*/
        val timer = object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val intent = Intent(this@MainActivity,Board::class.java)
                startActivity(intent)
            }

        }.start()
    }
}