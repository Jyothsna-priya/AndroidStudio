package com.example.annotations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.RoomMasterTable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: StudentDatabase
    lateinit var stu: Student
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database= Room.databaseBuilder(this,StudentDatabase::class.java,"stu_db").build()

        var user=findViewById<EditText>(R.id.editTextTextPersonName)
        var pass=findViewById<EditText>(R.id.editTextTextPersonName2)
        var sb=findViewById<Button>(R.id.button)
        var stb=findViewById<Button>(R.id.button2)

        sb.setOnClickListener {
            var username=user.text.toString()
            var password=pass.text.toString()

            GlobalScope.launch {
                stu = Student()
                database.StudentDAO().insertStudent(stu)


            }
        }

        stb.setOnClickListener {
            GlobalScope.launch {
                database.StudentDAO().readStudent().forEach{
                    var result="id is ${it.id} and username is ${it.username} and password is ${it.password} "
                }
            }
        }
    }
}