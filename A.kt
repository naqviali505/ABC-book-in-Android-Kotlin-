package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        var button =findViewById<Button>(R.id.button1)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,B::class.java)
            startActivity(intent) })


    }
}