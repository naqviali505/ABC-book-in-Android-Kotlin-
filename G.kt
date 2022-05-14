package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class G : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g)
        var button =findViewById<Button>(R.id.button7)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,H::class.java)
            startActivity(intent) })

    }
}