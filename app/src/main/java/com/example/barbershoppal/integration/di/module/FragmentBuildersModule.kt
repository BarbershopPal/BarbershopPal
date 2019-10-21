package com.example.barbershoppal.integration.di.module

import com.example.barbershoppal.NotificationsFragment
import com.example.barbershoppal.SelectionFragment
import com.example.barbershoppal.SignInFragment
import com.example.barbershoppal.notifications.NotificationsHostFragment
import com.example.barbershoppal.notifications.PreviousBookingsFragment
import com.example.barbershoppal.notifications.UpComingBookingsFragment
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
    abstract fun contributeNotificationsFragment(): NotificationsFragment

    @ContributesAndroidInjector
    abstract fun contributeUpComingBookingsFragment(): UpComingBookingsFragment

    @ContributesAndroidInjector
    abstract fun contributePreviousBookingsFragment(): PreviousBookingsFragment

    @ContributesAndroidInjector
    abstract fun contributeNotificationHostFragment(): NotificationsHostFragment
}