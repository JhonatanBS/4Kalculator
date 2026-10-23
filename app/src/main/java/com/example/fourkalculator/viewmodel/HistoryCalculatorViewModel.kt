package com.example.fourkalculator.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fourkalculator.data.repository.HistoryRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class HistoryCalculatorViewModel(private val repository: HistoryRepository) : ViewModel() {

    val history =
        repository.history.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    fun clearHistory() {
        viewModelScope.launch {
            repository.clearAllHistory()
        }
    }
}