package com.example.backtolife

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Login: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Handler(Looper.getMainLooper()).postDelayed({
            val homeIntent = Intent(this, Home::class.java)
            startActivity(homeIntent)
            finish()
        }, 4000)
    }
}