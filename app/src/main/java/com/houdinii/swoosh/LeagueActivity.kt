package com.houdinii.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.databinding.ActivityLeagueBinding

private lateinit var binding: ActivityLeagueBinding

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        binding.womensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = true
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View){
        binding.coedLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = true
        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View){
        binding.womensLeagueBtn.isChecked = false
        binding.mensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = true
        selectedLeague = "co-ed"

    }
}