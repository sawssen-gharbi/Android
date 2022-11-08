package com.example.backtolife

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        Handler(Looper.getMainLooper()).postDelayed({
            val loginIntent = Intent(this, Login::class.java)
            startActivity(loginIntent)
            finish()
        }, 4000)
    }
}