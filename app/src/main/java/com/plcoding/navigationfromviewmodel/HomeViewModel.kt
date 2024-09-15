package com.plcoding.navigationfromviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel(
    private val navigator: Navigator
): ViewModel() {

    fun navigateToDetail(id: String) {
        viewModelScope.launch {
            navigator.navigate(
                destination = Destination.DetailScreen(id),
            )
        }
    }
}