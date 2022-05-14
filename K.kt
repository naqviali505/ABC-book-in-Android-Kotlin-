package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class K : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k)
        var button =findViewById<Button>(R.id.button11)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,L::class.java)
            startActivity(intent) })

    }
}