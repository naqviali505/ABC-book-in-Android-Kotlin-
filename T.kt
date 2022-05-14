package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class T : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t)
        var button =findViewById<Button>(R.id.button20)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,U::class.java)
            startActivity(intent) })

    }
}