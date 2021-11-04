package com.example.popo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Board : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
    }

    fun signin(view: View) {
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }

    fun signin2(view: View) {
        val intent = Intent(this, signin2::class.java)
        startActivity(intent)
    }
}