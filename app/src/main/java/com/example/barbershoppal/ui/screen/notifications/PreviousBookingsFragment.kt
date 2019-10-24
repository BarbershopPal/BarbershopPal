package com.example.barbershoppal.ui.screen.notifications

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.barbershoppal.R
import com.example.barbershoppal.ui.screen.Fragment

class PreviousBookingsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.previous_bookings_fragment, container, false)
    }
}