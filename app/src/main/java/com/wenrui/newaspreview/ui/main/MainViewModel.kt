package com.wenrui.newaspreview.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val liveData = MutableLiveData<User>()

    fun start(user: User) {
        liveData.value = user
    }

    fun increaseUserId() {
        val user = liveData.value
        user!!.increaseId()
        liveData.value = user
    }
}
