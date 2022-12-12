package com.example.myapplication

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var languages = arrayOf("Java", "PHP", "Kotlin", "Javascript", "Python", "Swift")
    val NEW_SPINNER_ID = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylistview=findViewById<ListView>(R.id.mylistviews)

        var spin=findViewById<Spinner>(R.id.spinner)




        var Signinb = findViewById<TextView>(R.id.textView4)
        registerForContextMenu(Signinb)
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {

            menuInflater.inflate(R.menu.mymenu, menu)
            return super.onCreateOptionsMenu(menu)
        }

        override fun onOptionsItemSelected(item:MenuItem ): Boolean {

            var myid = item.itemId

            if(myid == R.id.mytoast){
                Toast.makeText(this,"toast is selected",Toast.LENGTH_SHORT).show()
            }

            if(myid == R.id.myact){
                Toast.makeText(this, "SEARCHING... ", Toast.LENGTH_SHORT).show()

                var builder = AlertDialog.Builder(this)

                    .setTitle("My Alert Dialog")
                    .setMessage("do you want to exit the App ?")
                    .setCancelable(false)
                    .setIcon(R.drawable.ic_launcher_foreground)

                    .setPositiveButton("Yes",DialogInterface.OnClickListener {
                            dialogInterface, i ->
                        this.finish()
                    })
                    .setNegativeButton("NO", DialogInterface.OnClickListener {
                            dialogInterface, i ->

                    })

                var ad = builder.create()
                ad.show()

            }



            return super.onOptionsItemSelected(item)
        }


        override fun onCreateContextMenu(
            menu: ContextMenu?,
            v: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            super.onCreateContextMenu(menu, v, menuInfo)

            menuInflater.inflate(R.menu.mymenu, menu)
        }

        override fun onContextItemSelected(item: MenuItem): Boolean {

            var myid = item.itemId
            if(myid == R.id.mytoast){
                Toast.makeText(this, "context item selected", Toast.LENGTH_SHORT).show()
            }
            return super.onContextItemSelected(item)
        }


//        var username1=findViewById<EditText>(R.id.editTextTextPersonName)
//        var password1=findViewById<EditText>(R.id.editTextTextPersonName2)
//        var Signinbu=findViewById<TextView>(R.id.textView4)
//        var mapsb=findViewById<Button>(R.id.button)
//        var calc=findViewById<Button>(R.id.button3)
//        var cale=findViewById<Button>(R.id.button4)
//
//        var username=username1.text.toString()
//        var password=password1.text.toString()
//
//        mapsb.setOnClickListener{
////            var myintent=Intent(this,SecondScreen::class.java)
////
////            var user=User("jyo","123","jyomail")
////            myintent.putExtra("keyobj",user)
//
////            startActivity(myintent)
//            var myIntent=Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/"))
//            startActivity(myIntent)
//        }
//        cale.setOnClickListener{
////            var myintent=Intent(this,SecondScreen::class.java)
////
////            var user=User("jyo","123","jyomail")
////            myintent.putExtra("keyobj",user)
//
////            startActivity(myintent)
//            var myIntent=Intent(Intent.CATEGORY_APP_CALENDAR)
//            startActivity(myIntent)
//        }
//        calc.setOnClickListener{
////            var myintent=Intent(this,SecondScreen::class.java)
////
////            var user=User("jyo","123","jyomail")
////            myintent.putExtra("keyobj",user)
//
////            startActivity(myintent)
//            val intent = Intent()
//            intent.action = Intent.ACTION_MAIN
//            intent.addCategory(Intent.CATEGORY_APP_CALCULATOR)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            startActivity(intent)
////            var myIntent=Intent(Intent.CATEGORY_APP_CALCULATOR)
////            startActivity(myIntent)


    }
