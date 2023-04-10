package com.property.zamaka

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate


class SplashAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            val intenr = Intent(this@SplashAct, MainActivity::class.java)
            startActivity(intenr)
            finish()
        }, 3000L)
    }
}