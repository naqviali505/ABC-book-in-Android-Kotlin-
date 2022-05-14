package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        var button =findViewById<Button>(R.id.button2)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,C::class.java)
            startActivity(intent) })

    }
}