package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var signinbutton = findViewById<Button>(R.id.button4)
        var gotofirstpage=findViewById<Button>(R.id.buttonsa1)
        var usernameEditText = findViewById<EditText>(R.id.editTextTextPersonName)
        var passwordEditText = findViewById<EditText>(R.id.editTextTextPassword2)
        var usernameTextView=findViewById<TextView>(R.id.textView)
        var passwordTextView=findViewById<TextView>(R.id.textView2)

        signinbutton.setOnClickListener {
            var username = usernameEditText.text.toString()
            var password = passwordEditText.text.toString()
            if (username.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "fill both the details", Toast.LENGTH_LONG).show()
            }
            if (username == "abc" && password == "123") {
                Toast.makeText(this, "entered details are correct", Toast.LENGTH_LONG).show()
//                usernameTextView.setText(username)
//                passwordTextView.setText(password)

                var myIntent = Intent(this, SecondActivity::class.java)
                myIntent.putExtra("key1", username)
                myIntent.putExtra("key2",password)

//                var user=User("jyo","hello")
//                myIntent.putExtra("keyobj",user)

                startActivity(myIntent)

            }
        }
        }
    }