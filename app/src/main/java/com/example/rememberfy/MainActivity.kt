package com.example.rememberfy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
        var btn_play = findViewById(R.id.btn_play) as Button
        btn_play.setOnClickListener{
           val intent = Intent(this@MainActivity, ActivityPlay::class.java)
           startActivity(intent)
        }
   }
}