package com.userstory.checkrebasegithub111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = 1 + 1
        val y = 2 + 2
        val z = x + y
        Log.e("TAG1", z.toString() + "")
        Log.e("TAG2", y.toString() + "")
    }
}