package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class O : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o)
        var button =findViewById<Button>(R.id.button15)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,P::class.java)
            startActivity(intent) })

    }
}