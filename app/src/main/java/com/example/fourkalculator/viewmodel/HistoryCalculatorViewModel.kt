package com.example.fourkalculator.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fourkalculator.data.repository.HistoryRepository
import com.example.fourkalculator.ui.utils.CalculationHistory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HistoryCalculatorViewModel(private val repository: HistoryRepository) : ViewModel() {

    private val _history = MutableStateFlow<List<CalculationHistory>>(emptyList())
    val history: StateFlow<List<CalculationHistory>> = _history.asStateFlow()

    init {
        loadHistory()
    }

    fun loadHistory() {
        viewModelScope.launch {
            _history.value = repository.getHistory()
        }
    }

    fun clearHistory() {
        viewModelScope.launch {
            repository.clearAllHistory()
        }
    }
}