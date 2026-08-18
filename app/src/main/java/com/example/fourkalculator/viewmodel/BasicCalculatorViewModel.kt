package com.example.fourkalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fourkalculator.helper.IsValidInputDisplay
import com.example.fourkalculator.ui.utils.ButtonType

class BasicCalculatorViewModel : ViewModel() {

    private val _expression = MutableLiveData<String>()
    val expression: LiveData<String> = _expression

    private val _result = MutableLiveData("")
    val result: LiveData<String> = _result

    fun handleKeyInput(value: String, type: ButtonType) {
        when (value) {
            "CE" -> clearDisplay()
            "C" -> clearLastInput()
            "=" -> fullResult(value)
            else -> addInputValue(value, type)

        }
    }

    private fun fullResult(value: String) {
        TODO("Not yet implemented")
    }

    private fun clearLastInput() {
        val currentExpression = _expression.value ?: return

        if (currentExpression.isEmpty()) {
            return
        }

        _expression.value = currentExpression.dropLast(1)
    }

    fun addInputValue(value: String, type: ButtonType) {
        val currentExpression = _expression.value.orEmpty()

        when (type) {
            ButtonType.NUMBER -> {
                _expression.value = currentExpression + value
            }

            ButtonType.OPERATOR -> {
                if (!IsValidInputDisplay().isLastCharacterOperator(currentExpression)) {
                    _expression.value = currentExpression + value
                }
            }

            ButtonType.FUNCTION -> {
                // Logic of function
            }

        }
    }

    fun clearDisplay() {
        _expression.value = ""
    }
}