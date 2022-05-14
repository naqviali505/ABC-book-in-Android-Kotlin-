package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class D : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        var button =findViewById<Button>(R.id.button4)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,E::class.java)
            startActivity(intent) })

    }
}