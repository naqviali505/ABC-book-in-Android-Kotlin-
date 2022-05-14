package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class W : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_w)
        var button =findViewById<Button>(R.id.button23)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,X::class.java)
            startActivity(intent) })

    }
}