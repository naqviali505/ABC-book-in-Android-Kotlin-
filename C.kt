package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class C : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        var button =findViewById<Button>(R.id.button3)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,D::class.java)
            startActivity(intent) })

    }
}