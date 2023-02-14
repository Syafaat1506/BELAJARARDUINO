package com.example.belajararduino

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class BoardActivity : YouTubeBaseActivity() {
    val VIDEO_ID = "8EuHZ31JQZ4"
    val YOUTUBE_API_KEY ="AIzaSyBuwueRJlafkwQM5QLXUB-mMtyWQNbUbhU"

    private lateinit var youtubePlayer2: YouTubePlayerView

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)

        val back1 = findViewById<ImageView>(R.id.imgBackC)
        back1.setOnClickListener {
            Intent(this,ElektronikActivity::class.java).also {
                startActivity(it)
            }
        }
        youtubePlayer2 = findViewById(R.id.youtubePlayer2)
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
        youtubePlayer2.setOnClickListener {
            youtubePlayer2.initialize(YOUTUBE_API_KEY,youtubePlayerInit)
        }
    }
}