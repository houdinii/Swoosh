package com.houdinii.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.R
import com.houdinii.swoosh.databinding.ActivityWelcomeBinding

private lateinit var binding: ActivityWelcomeBinding

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.getStartedBtn.setOnClickListener{
            // 'this' is the context for 'this' activity
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}