package com.example.app.ui

import com.example.app.ui.event.NavEvent
import com.example.app.ui.viewmodel.NavViewModel

class EventHandler(
    private val navigationViewModel: NavViewModel
) {
    fun postNavEvent(event: NavEvent){
        navigationViewModel.updateEvent(event)
    }
    fun navEvent() = navigationViewModel.event

    override fun toString(): String {
        return navEvent().value.toString()
    }
}