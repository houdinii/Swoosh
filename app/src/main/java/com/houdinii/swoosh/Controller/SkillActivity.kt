package com.houdinii.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.houdinii.swoosh.R
import com.houdinii.swoosh.Utilities.EXTRA_LEAGUE
import com.houdinii.swoosh.Utilities.EXTRA_SKILL
import com.houdinii.swoosh.databinding.ActivitySkillBinding

private lateinit var binding:ActivitySkillBinding

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimaryDark)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        Log.d(TAG, "${javaClass.simpleName} EXTRA_LEAGUE Value: $league")
    }

    fun onBeginnerClicked(view: View){
        println(view)
        binding.beginnerSkillBtn.isChecked = true
        binding.ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view: View){
        println(view)
        binding.beginnerSkillBtn.isChecked = false
        binding.ballerSkillBtn.isChecked = true
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View){
        println(view)
        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}