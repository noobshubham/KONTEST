package com.example.kontext.ui.kontext

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kontext.network.KontextData

enum class KontextApiStatus { LOADING, ERROR, DONE }

class KontextViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private val _status = MutableLiveData<KontextApiStatus>()
    val status: LiveData<KontextApiStatus> = _status

    private val _contestData = MutableLiveData<List<KontextData>>()
    val contestData: LiveData<List<KontextData>> = _contestData


    fun getContestData() {
    }
}