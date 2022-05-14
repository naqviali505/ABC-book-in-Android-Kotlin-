package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button =findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var intent=Intent(this,A::class.java)
            startActivity(intent) }
    }
}