package com.example.barbershoppal.ui.screen.bookings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.barbershoppal.R
import com.example.barbershoppal.ui.screen.Fragment
import kotlinx.android.synthetic.main.notifications_host_fragment.*

class MyBookingsHostFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.notifications_host_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
        setUpToolbar()
    }

    private fun setUpViewPager() {
        viewPager.adapter = MyBookingsHostAdapter(childFragmentManager)
        notificationTabLayout.setupWithViewPager(viewPager)
    }

    private fun setUpToolbar() {
        setToolbar(
            view = toolbar,
            title = resources.getString(R.string.my_bookings),
            icon = R.drawable.ic_back
        )
    }

}