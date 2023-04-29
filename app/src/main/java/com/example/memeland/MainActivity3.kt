package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var tilprev1:Button
    lateinit var tilnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        tilprev1=findViewById(R.id.tilprev1)
        tilprev1.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        tilnext2=findViewById(R.id.tilnext2)
        tilnext2.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java )
            startActivity(intent)
        }
  }
     }

