package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class J : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_j)
        var button =findViewById<Button>(R.id.button10)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,K::class.java)
            startActivity(intent) })

    }
}