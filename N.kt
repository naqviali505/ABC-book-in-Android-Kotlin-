package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class N : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n)
        var button =findViewById<Button>(R.id.button14)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,O::class.java)
            startActivity(intent) })

    }
}