package com.example.fourkalculator.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fourkalculator.data.repository.HistoryRepository

class CalculatorViewModelFactory(private val repository: HistoryRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(
                BasicCalculatorViewModel::class.java
            ) -> BasicCalculatorViewModel(repository) as T

            modelClass.isAssignableFrom(
                AdvancedCalculatorViewModel::class.java
            ) -> AdvancedCalculatorViewModel(repository) as T

            modelClass.isAssignableFrom(
                HistoryCalculatorViewModel::class.java
            ) -> HistoryCalculatorViewModel(repository) as T

            else -> throw IllegalArgumentException(
                "Unknown ViewModel class: ${modelClass.name}"
            )
        }
    }
}