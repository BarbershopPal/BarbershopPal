package com.example.barbershoppal.ui.screen.notifications

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class NotificationsHostAdapter(
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> UpComingBookingsFragment()
            else -> PreviousBookingsFragment()
        }
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Upcoming bookings"
            else -> "Previous bookings"
        }
    }
}