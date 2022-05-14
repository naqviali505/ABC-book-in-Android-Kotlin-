package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class Z : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_z)
        var button =findViewById<Button>(R.id.button26)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent) })

    }
}