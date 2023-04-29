package com.example.memeland

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var tilprev4:Button
    lateinit var tilnext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        tilprev4=findViewById(R.id.tilprev4)
        tilprev4.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        tilnext3=findViewById(R.id.tilnext3)
        tilnext3.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
    }

