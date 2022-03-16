package com.example.hw10_q1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var name:String="",
                var userName:String="",
                var email:String="",
                var password:String="",
                var gender:String=""):Parcelable
