package com.example.barbershoppal.onboarding

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import com.example.barbershoppal.ImageFragmentPagerAdapter
import com.example.barbershoppal.MainActivity
import com.example.barbershoppal.R
import kotlinx.android.synthetic.main.onboarding_activity.*

class OnBoardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_activity)

        val pagerAdapter =
            ImageFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
        indicatorDots.setupWithViewPager(viewPager, true)

        btnOnBoardingSkip.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            this.startActivity(intent)
            finish()
        }
    }

}