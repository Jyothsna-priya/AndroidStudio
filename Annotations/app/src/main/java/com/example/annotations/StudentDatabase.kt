package com.example.annotations

import androidx.room.Database


@Database(entities = [Student::class], version = 1)
abstract class StudentDatabase() {

    abstract fun StudentDAO():StudentDAO
}