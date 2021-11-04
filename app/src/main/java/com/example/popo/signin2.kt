package com.example.popo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class signin2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin2)
    }

    fun signin(view: View) {
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }
}