package com.houdinii.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.houdinii.swoosh.databinding.ActivitySkillBinding

private lateinit var binding:ActivitySkillBinding

class SkillActivity : BaseActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        Log.d(TAG, "${javaClass.simpleName} EXTRA_LEAGUE Value: $league")
    }
}