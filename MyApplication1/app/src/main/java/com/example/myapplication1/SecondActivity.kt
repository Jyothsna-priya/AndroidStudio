package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var gotofirstpage=findViewById<Button>(R.id.buttonsa1)
        var gotothirdpage=findViewById<Button>(R.id.buttonsa2)
        var usernameTv=findViewById<TextView>(R.id.textView3)
        var passwordTv=findViewById<TextView>(R.id.textView4)
        var obj=findViewById<TextView>(R.id.)
        var res1=intent.extras?.getString("key1")
        var res2=intent.extras?.getString("key2")

        usernameTv.text=res1
        passwordTv.text=res2

        gotofirstpage.setOnClickListener{
            var myIntent2=Intent(this,MainActivity::class.java)
            startActivity(myIntent2)

    }
        gotothirdpage.setOnClickListener{
            var myIntent2=Intent(this,ThirdActivity::class.java)
            startActivity(myIntent2)

        }

}
}