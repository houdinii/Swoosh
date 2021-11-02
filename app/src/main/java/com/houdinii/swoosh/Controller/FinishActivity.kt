package com.houdinii.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.Model.Player
import com.houdinii.swoosh.R
import com.houdinii.swoosh.Utilities.EXTRA_PLAYER
import com.houdinii.swoosh.databinding.ActivityFinishBinding

private lateinit var binding: ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    private var player : Player? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        val searchLeaguesTextStr = "Looking for ${player?.league} ${player?.skill} league near you..."
        binding.searchLeaguesText.text = searchLeaguesTextStr
    }
}