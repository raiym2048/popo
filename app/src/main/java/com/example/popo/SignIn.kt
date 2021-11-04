package com.example.popo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


    }

    fun toMain(view: View) {
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
    }
}