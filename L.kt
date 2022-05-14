package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class L : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_l)
        var button =findViewById<Button>(R.id.button12)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,M::class.java)
            startActivity(intent) })

    }
}