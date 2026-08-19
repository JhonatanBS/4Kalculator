package com.example.fourkalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fourkalculator.helper.IsValidInputDisplay
import com.example.fourkalculator.ui.utils.ButtonType

class BasicCalculatorViewModel : ViewModel() {

    private val _expression = MutableLiveData("")
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
        //_result.value = value.
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
                val input = IsValidInputDisplay.resolveParenthesisInput(currentExpression, value)

                _expression.value = currentExpression + input
            }

            ButtonType.OPERATOR -> {
                val isLastOperator = IsValidInputDisplay.isLastCharacterOperator(currentExpression)
                val isInvalidFirstOperator =
                    currentExpression.isEmpty() && (value == "/" || value == "*")

                if (!isLastOperator && !isInvalidFirstOperator) {
                    _expression.value = currentExpression + value
                }
            }

            ButtonType.FUNCTION -> {
                // Logic of function
            }

            ButtonType.GROUPING -> {
                _expression.value += IsValidInputDisplay.resolveParenthesisInput(
                    expression.value,
                    value
                )
            }
        }
    }

    fun clearDisplay() {
        _expression.value = ""
    }
}