package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ElektronikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elektronik)
        val nonton1 = findViewById<Button>(R.id.btnNonton1)
        val nonton2 = findViewById<Button>(R.id.btnNonton2)
        val nonton3 = findViewById<Button>(R.id.btnNonton3)
        val back1 = findViewById<ImageView>(R.id.imgBackE)

        nonton1.setOnClickListener {
            Intent(this,MultimeterActivity::class.java).also {
                startActivity(it)
            }
        }
        nonton2.setOnClickListener {
            Intent(this,OsiActivity::class.java).also {
                startActivity(it)
            }
        }
        nonton3.setOnClickListener {
            Intent(this,BoardActivity::class.java).also {
                startActivity(it)
            }
        }
        back1.setOnClickListener {
            Intent(this, MateriActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}