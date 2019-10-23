package com.example.barbershoppal.notifications

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.barbershoppal.MainActivity
import com.example.barbershoppal.R
import kotlinx.android.synthetic.main.notifications_host_fragment.*
import javax.inject.Inject

class NotificationsHostFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.notifications_host_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        viewPager.adapter = NotificationsHostAdapter(childFragmentManager)

    }

}