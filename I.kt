package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class I : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i)
        var button =findViewById<Button>(R.id.button9)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,J::class.java)
            startActivity(intent) })

    }
}