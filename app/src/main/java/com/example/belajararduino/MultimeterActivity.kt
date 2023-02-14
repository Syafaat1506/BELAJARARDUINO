package com.example.belajararduino

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class MultimeterActivity : YouTubeBaseActivity() {
    val VIDEO_ID = "0y7KnakTv7k"
    val YOUTUBE_API_KEY ="AIzaSyBuwueRJlafkwQM5QLXUB-mMtyWQNbUbhU"

    private lateinit var youtubePlayer3: YouTubePlayerView

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multimeter)

        val back1 = findViewById<ImageView>(R.id.imgBackA)
        back1.setOnClickListener {
            Intent(this,ElektronikActivity::class.java).also {
                startActivity(it)
            }
        }
        youtubePlayer3 = findViewById(R.id.youtubePlayer3)
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
        youtubePlayer3.setOnClickListener {
            youtubePlayer3.initialize(YOUTUBE_API_KEY,youtubePlayerInit)
        }
    }
}