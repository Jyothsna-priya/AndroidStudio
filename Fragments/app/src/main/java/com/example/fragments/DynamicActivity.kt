package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dbsfragments.RedFragment

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        supportFragmentManager.beginTransaction().add(R.id.mydynamiclayout, RedFragment()).commit()
    }
}