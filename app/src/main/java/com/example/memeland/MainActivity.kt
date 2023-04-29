package com.example.memeland

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var tilnext:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilnext=findViewById(R.id.tilnext)
        tilnext.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}