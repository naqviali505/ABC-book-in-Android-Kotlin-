package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class Y : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y)
        var button =findViewById<Button>(R.id.button25)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,Z::class.java)
            startActivity(intent) })

    }
}