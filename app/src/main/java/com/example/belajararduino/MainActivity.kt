package com.example.belajararduino

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Back = findViewById<ImageView>(R.id.imgBack0)
        val Materi = findViewById<Button>(R.id.btnMateri)
        val profil = findViewById<ImageView>(R.id.imgProfil)
        val help = findViewById<Button>(R.id.btnHelp)
        val evaluasi = findViewById<Button>(R.id.btnEvaluasi)
        Materi.setOnClickListener {
            Intent(this,MateriActivity::class.java).also {
                startActivity(it)
            }
        }
        profil.setOnClickListener {
            Intent(this,ProfilActivity::class.java).also {
                startActivity(it)
            }
        }
        help.setOnClickListener {
            Intent(this,HelpActivity::class.java).also {
                startActivity(it)
            }
        }
        evaluasi.setOnClickListener {
            Intent(this,EvaluasiActivity::class.java).also {
                startActivity(it)
            }
        }
        Back.setOnClickListener {
            val eBuilder = AlertDialog.Builder(this)
            eBuilder.setTitle("Exit")
            eBuilder.setMessage ("Apakah Kamu Ingin Keluar?")
            eBuilder.setPositiveButton("yes"){
                Dialog,which->
                moveTaskToBack(true)
                android.os.Process.killProcess(android.os.Process.myPid())
                System.exit(1)
            }
            eBuilder.setNegativeButton("No"){
                Dialog,which->
                Dialog.cancel()
                }
                .show()
        }
    }
}