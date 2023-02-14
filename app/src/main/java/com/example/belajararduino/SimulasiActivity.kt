package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SimulasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulasi)

        val proteus = findViewById<ImageView>(R.id.imgnonton1)
        val tinker = findViewById<ImageView>(R.id.imgnonton2)
        val kembali = findViewById<ImageView>(R.id.imgBackX)


        proteus.setOnClickListener {
            Intent(this,ProteusActivity::class.java).also {
                startActivity(it)
            }
        }
        tinker.setOnClickListener {
            Intent(this,TinkerActivity::class.java).also {
                startActivity(it)
            }
        }
        kembali.setOnClickListener {
            Intent(this,MateriActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}