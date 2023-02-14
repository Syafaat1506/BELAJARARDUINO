package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()
        val image = intent.getParcelableExtra<Image>(KomponenActivity.INTENT_PARCELABLE)


        val imgSrc = findViewById<ImageView>(R.id.imgDetail)
        val imageTitle = findViewById<TextView>(R.id.tvTitle)
        val imageDesc = findViewById<TextView>(R.id.tvscrol)
        val imgRangkaian = findViewById<ImageView>(R.id.imgRangkaian)
        val tvCode = findViewById<TextView>(R.id.tvCode)
        val kembali = findViewById<ImageView>(R.id.imgBack13)
        val hasil = findViewById<TextView>(R.id.tvHasil)
        val project = findViewById<ImageView>(R.id.imgHasil)
        val tvhasil = findViewById<TextView>(R.id.tvsimpul)

        imgSrc.setImageResource(image?.imageSrc!!)
        imageTitle.text = image.Title
        imageDesc.text = image.Desc
        imgRangkaian.setImageResource(image?.Rangkaian!!)
        tvCode.text = image.Code
        hasil.text = image.Hasil
        project.setImageResource(image?.Project!!)
        tvhasil.text = image.Tvhasil
        kembali.setOnClickListener {
            Intent(this,KomponenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}