package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class Q : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q)
        var button =findViewById<Button>(R.id.button17)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,R1::class.java)
            startActivity(intent) })

    }
}