package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class X : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x)
        var button =findViewById<Button>(R.id.button24)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,Y::class.java)
            startActivity(intent) })

    }
}