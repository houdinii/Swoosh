package com.houdinii.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.R
import com.houdinii.swoosh.Utilities.EXTRA_LEAGUE
import com.houdinii.swoosh.Utilities.EXTRA_SKILL
import com.houdinii.swoosh.databinding.ActivityFinishBinding

private lateinit var binding: ActivityFinishBinding

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill = intent.getStringExtra(EXTRA_SKILL).toString()

        val searchLeaguesTextStr = "Looking for $league $skill league near you..."
        binding.searchLeaguesText.text = searchLeaguesTextStr
    }
}