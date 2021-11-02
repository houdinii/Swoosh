package com.houdinii.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.Model.Player
import com.houdinii.swoosh.R
import com.houdinii.swoosh.Utilities.EXTRA_PLAYER
import com.houdinii.swoosh.databinding.ActivityLeagueBinding

private lateinit var binding: ActivityLeagueBinding

class LeagueActivity : BaseActivity() {
    private var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun leagueNextClicked(view: View){
        println(view)
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        println(view)
        binding.womensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = true
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        println(view)
        binding.coedLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = true
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        println(view)
        binding.womensLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = true
        player.league = "co-ed"
    }
}