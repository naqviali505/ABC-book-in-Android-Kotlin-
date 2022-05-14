package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class S : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s)
        var button =findViewById<Button>(R.id.button19)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,T::class.java)
            startActivity(intent) })

    }
}