package de.kabiskac.weekdaybug.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _enabled = MutableLiveData<Boolean>()
    val enabled: LiveData<Boolean>
        get() = _enabled

    fun setEnabled(b: Boolean) {
        _enabled.value = b
    }

    init {
        _enabled.value = true
    }
}