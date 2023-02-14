package com.example.belajararduino

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class OsiActivity : YouTubeBaseActivity() {
    val VIDEO_ID = "Zzr_3xBE7Qw"
    val YOUTUBE_API_KEY ="AIzaSyBuwueRJlafkwQM5QLXUB-mMtyWQNbUbhU"

    private lateinit var youtubePlayer4: YouTubePlayerView

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osi)

        val back1 = findViewById<ImageView>(R.id.imgBackB)
        back1.setOnClickListener {
            Intent(this,ElektronikActivity::class.java).also {
                startActivity(it)
            }
        }
        youtubePlayer4 = findViewById(R.id.youtubePlayer4)
        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext,"FAILED",Toast.LENGTH_SHORT).show()
            }
        }
        youtubePlayer4.setOnClickListener {
            youtubePlayer4.initialize(YOUTUBE_API_KEY,youtubePlayerInit)
        }
    }
}