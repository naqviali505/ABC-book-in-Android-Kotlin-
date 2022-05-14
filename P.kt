package com.example.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
class P : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p)
        var button =findViewById<Button>(R.id.button16)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,Q::class.java)
            startActivity(intent) })

    }
}