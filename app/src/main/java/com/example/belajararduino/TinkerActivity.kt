package com.example.belajararduino

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class TinkerActivity: YouTubeBaseActivity() {
    val VIDEO_ID = "DE6kCRcrrtE"
    val YOUTUBE_API_KEY ="AIzaSyBuwueRJlafkwQM5QLXUB-mMtyWQNbUbhU"

    private lateinit var youtubePlayer1: YouTubePlayerView

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinker)

        val back1 = findViewById<ImageView>(R.id.imgBackQ)
        back1.setOnClickListener {
            Intent(this,SimulasiActivity::class.java).also {
                startActivity(it)
            }
        }
        youtubePlayer1 = findViewById(R.id.youtubePlayer1)
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
        youtubePlayer1.setOnClickListener {
            youtubePlayer1.initialize(YOUTUBE_API_KEY,youtubePlayerInit)
        }
    }
}