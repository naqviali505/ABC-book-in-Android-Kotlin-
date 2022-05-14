package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class V : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v)
        var button =findViewById<Button>(R.id.button22)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,W::class.java)
            startActivity(intent) })

    }
}