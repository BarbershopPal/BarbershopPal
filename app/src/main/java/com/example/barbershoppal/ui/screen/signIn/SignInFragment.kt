package com.example.barbershoppal.ui.screen.signIn


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.barbershoppal.R
import com.example.barbershoppal.ui.screen.Fragment
import kotlinx.android.synthetic.main.sign_in_fragment.*

class SignInFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sign_in_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navigateToNotificationsHostFragment()
    }

    private fun navigateToNotificationsHostFragment() {
        facebookLogin.setOnClickListener{
            navController.navigate(R.id.notificationHostFragment)
        }
    }
}
