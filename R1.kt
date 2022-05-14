package com.example.book
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class R1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r)
        var button =findViewById<Button>(R.id.button18)
        button.setOnClickListener(View.OnClickListener {
            var intent=Intent(this,S::class.java)
            startActivity(intent) })

    }
}