package com.plcoding.navigationfromviewmodel.di

import com.plcoding.navigationfromviewmodel.DefaultNavigator
import com.plcoding.navigationfromviewmodel.Destination
import com.plcoding.navigationfromviewmodel.DetailViewModel
import com.plcoding.navigationfromviewmodel.HomeViewModel
import com.plcoding.navigationfromviewmodel.LoginViewModel
import com.plcoding.navigationfromviewmodel.Navigator
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    single<Navigator> {
        DefaultNavigator(startDestination = Destination.AuthGraph)
    }

    viewModelOf(::LoginViewModel)
    viewModelOf(::HomeViewModel)
    viewModelOf(::DetailViewModel)
}