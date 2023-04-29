package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var tilprev:Button
    lateinit var tilnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tilprev=findViewById(R.id.tilprev)
        tilprev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java )
            startActivity(intent)
        }
        tilnext=findViewById(R.id.tilnext)
        tilnext.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java )
            startActivity(intent)

    }
}
     }