package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class H : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h)
        var button =findViewById<Button>(R.id.button8)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,I::class.java)
            startActivity(intent) })

    }
}