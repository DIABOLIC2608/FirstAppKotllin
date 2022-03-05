package com.map.firstappkotllin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.b1)
        button.setOnClickListener{
            Toast.makeText(applicationContext,"Hello world",Toast.LENGTH_LONG).show()
            var intent=Intent(applicationContext.MainActivity2::class.java)
            intent
        }
    }
}