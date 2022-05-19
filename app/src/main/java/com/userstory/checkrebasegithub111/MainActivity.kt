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
        val z1 = x + y
        val z3 = z1
        Log.e("TAG1", z.toString() + "")
    }
}