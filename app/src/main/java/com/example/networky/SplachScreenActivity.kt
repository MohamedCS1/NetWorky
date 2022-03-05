package com.example.networky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplachScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screen)
        Handler().postDelayed(Runnable {
            val i = Intent(this, PresantationActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)

    }
}