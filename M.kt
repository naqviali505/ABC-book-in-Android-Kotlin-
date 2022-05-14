package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class M : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m)
        var button =findViewById<Button>(R.id.button13)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,N::class.java)
            startActivity(intent) })

    }
}