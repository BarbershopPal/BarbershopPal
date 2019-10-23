package com.example.barbershoppal.ui.screen.signIn


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.barbershoppal.R
import kotlinx.android.synthetic.main.sign_in_fragment.*

class SignInFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sign_in_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        signUp.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toCreateAccount))
    }


}
