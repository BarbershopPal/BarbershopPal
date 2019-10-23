package com.example.barbershoppal.ui.screen.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.barbershoppal.onboarding.FirstOnboardingFragment
import com.example.barbershoppal.onboarding.SecondOnboardingFragment
import com.example.barbershoppal.onboarding.ThirdOnboardingFragment
import javax.inject.Inject

class ImageFragmentPagerAdapter @Inject constructor(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstOnboardingFragment()
            1 -> SecondOnboardingFragment()
            2 -> ThirdOnboardingFragment()
            else -> FirstOnboardingFragment()
        }
    }

    override fun getCount(): Int = 3

}
