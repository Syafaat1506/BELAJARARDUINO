package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        val back1 = findViewById<ImageView>(R.id.imgBack1)
        val arduino = findViewById<Button>(R.id.btnArduino)
        val komponen = findViewById<Button>(R.id.btnKomponen)
        val elektronik = findViewById<Button>(R.id.btnElektronik)
        val simulasi = findViewById<Button>(R.id.btnSimulasi)
        val bahasa = findViewById<Button>(R.id.btnBahasa)

        back1.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
        arduino.setOnClickListener {
            Intent(this,ArduinoActivity::class.java).also {
                startActivity(it)
            }
        }
        komponen.setOnClickListener {
            Intent(this,KomponenActivity::class.java).also {
                startActivity(it)
            }
        }
        elektronik.setOnClickListener {
            Intent(this,ElektronikActivity::class.java).also {
                startActivity(it)
            }
        }
        simulasi.setOnClickListener {
            Intent(this,SimulasiActivity::class.java).also {
                startActivity(it)
            }
        }
        bahasa.setOnClickListener {
            Intent(this,BahasaActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    override fun onBackPressed() {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}