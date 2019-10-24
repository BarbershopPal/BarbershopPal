package com.example.barbershoppal.ui.screen.signIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.barbershoppal.R
import com.example.barbershoppal.ui.screen.Fragment

class SelectionFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.selection_fragment, container, false)
    }
}