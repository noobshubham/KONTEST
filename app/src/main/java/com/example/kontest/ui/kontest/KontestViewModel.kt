package com.example.kontest.ui.kontest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kontest.network.KontestApi
import com.example.kontest.network.KontestData
import kotlinx.coroutines.launch

enum class KontestApiStatus { LOADING, ERROR, DONE }

class KontextViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private val _status = MutableLiveData<KontestApiStatus>()
    val status: LiveData<KontestApiStatus> = _status

    private val _contestData = MutableLiveData<List<KontestData>>()
    val contestData: LiveData<List<KontestData>> = _contestData

    init {
        getContestData()
    }

    private fun getContestData() {
        viewModelScope.launch {
            _status.value = KontestApiStatus.LOADING
            try {
                _contestData.value = KontestApi.kontestService.getKontest()
                _status.value = KontestApiStatus.DONE
            } catch (e: Exception) {
                _status.value = KontestApiStatus.ERROR
                _contestData.value = listOf()
            }
        }
    }
}