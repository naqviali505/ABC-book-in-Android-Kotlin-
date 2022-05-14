package com.example.book
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class U : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_u)
        var button =findViewById<Button>(R.id.button21)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,V::class.java)
            startActivity(intent) })

    }
}