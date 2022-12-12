package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var logoutt=findViewById<TextView>(R.id.textViewta)

        logoutt.setOnClickListener(){
            var myintent=Intent(this,MainActivity::class.java)
            startActivity(myintent)
        }
    }
}