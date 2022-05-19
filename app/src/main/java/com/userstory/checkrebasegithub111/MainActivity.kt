package com.userstory.checkrebasegithub111

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = 1 + 1
        val y = 2 + 2
        val z = x + y
        val z1 = x + y
        val z2 = y + x
        Log.e("TAG1", z.toString() + "")
        Log.e("TAG2", z.toString() + "")
    }
}