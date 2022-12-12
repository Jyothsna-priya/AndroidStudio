package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        var username1 = findViewById<EditText>(R.id.editTextTextPersonName)
        var password1 = findViewById<EditText>(R.id.editTextTextPersonName2)
        var Email1 = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var Signinbu = findViewById<TextView>(R.id.textView4)

        var username = username1.text.toString()
        var password = password1.text.toString()
        var email = Email1.text.toString()

        Signinbu.setOnClickListener {
            var myintent = Intent(this, User::class.java)

//            var user=User("jyo","123","jyomail")
//            myintent.putExtra("keyobj",user)

            startActivity(myintent)
        }
    }
}