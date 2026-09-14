package com.example.fourkalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fourkalculator.ui.utils.ButtonContent
import com.example.fourkalculator.ui.utils.ButtonType

class AdvancedCalculatorViewModel : ViewModel() {

    private val _expression = MutableLiveData("")
    val expression: LiveData<String> = _expression

    private val _result = MutableLiveData("0")
    val result: LiveData<String> = _result

    fun handleKeyInput(value: ButtonContent, type: ButtonType) {

    }

    private fun fullResult() {

    }

    private fun clearLastInput() {
        val currentExpression = _expression.value ?: return

        if (currentExpression.isEmpty()) {
            return
        }

        _expression.value = currentExpression.dropLast(1)
    }

    fun addInputValue(value: String, type: ButtonType) {

    }

    fun clearDisplay() {
        _expression.value = ""
    }
}