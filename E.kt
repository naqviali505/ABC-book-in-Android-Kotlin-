package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class E : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        var button =findViewById<Button>(R.id.button5)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,F::class.java)
            startActivity(intent) })

    }
}