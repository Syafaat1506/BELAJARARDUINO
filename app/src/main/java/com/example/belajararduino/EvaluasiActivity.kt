package com.example.belajararduino

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue

class EvaluasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evaluasi)
        supportActionBar?.hide()

        val back = findViewById<ImageView>(R.id.imageView2)
        val start=findViewById<Button>(R.id.start)


       start.setOnClickListener {
           Intent(this,SoalActivity::class.java).also {
               startActivity(it)
           }
        }
        back.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    override fun onBackPressed() {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)


    }
}