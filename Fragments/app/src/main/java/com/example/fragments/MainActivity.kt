package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.dbsfragments.RedFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redButton = findViewById<Button>(R.id.buttonred)
        var blueButton = findViewById<TextView>(R.id.buttonblue)


        redButton.setOnClickListener {
            var redFragment =RedFragment()
            var manager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView2, redFragment)
            transaction.commit()

        }

    }
}