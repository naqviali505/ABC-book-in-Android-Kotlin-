package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class F : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)
        var button =findViewById<Button>(R.id.button6)
        button.setOnClickListener(View.OnClickListener
        {
            var intent=Intent(this,G::class.java)
            startActivity(intent)
        })

    }
}