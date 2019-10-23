package com.example.barbershoppal.integration.di.module

import com.example.barbershoppal.ui.screen.signIn.SelectionFragment
import com.example.barbershoppal.ui.screen.signIn.SignInFragment
import com.example.barbershoppal.ui.screen.notifications.NotificationsHostFragment
import com.example.barbershoppal.ui.screen.notifications.PreviousBookingsFragment
import com.example.barbershoppal.ui.screen.notifications.UpComingBookingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
internal abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeSignInFragment(): SignInFragment

    @ContributesAndroidInjector
    abstract fun contributeSelectionFragment(): SelectionFragment

    @ContributesAndroidInjector
    abstract fun contributeUpComingBookingsFragment(): UpComingBookingsFragment

    @ContributesAndroidInjector
    abstract fun contributePreviousBookingsFragment(): PreviousBookingsFragment

    @ContributesAndroidInjector
    abstract fun contributeNotificationHostFragment(): NotificationsHostFragment
}