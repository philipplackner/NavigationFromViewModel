package com.plcoding.navigationfromviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DetailViewModel(
    private val navigator: Navigator
): ViewModel() {

    fun goBack() {
        viewModelScope.launch {
            navigator.navigateUp()
        }
    }
}