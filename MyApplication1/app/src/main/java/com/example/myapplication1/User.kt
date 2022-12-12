package com.example.myapplication1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(var username:String,var pwd:String):Parcelable {

}