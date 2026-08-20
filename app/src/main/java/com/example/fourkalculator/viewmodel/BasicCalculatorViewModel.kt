package com.example.fourkalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fourkalculator.helper.IsValidInputDisplay
import com.example.fourkalculator.ui.utils.ButtonType
import org.mariuszgromada.math.mxparser.Expression

class BasicCalculatorViewModel : ViewModel() {

    private val _expression = MutableLiveData("")
    val expression: LiveData<String> = _expression

    private val _result = MutableLiveData("")
    val result: LiveData<String> = _result

    fun handleKeyInput(value: String, type: ButtonType) {
        when (value) {
            "CE" -> clearDisplay()
            "C" -> clearLastInput()
            "=" -> fullResult()
            else -> addInputValue(value, type)
        }
    }

    private fun fullResult() {
        if (expression.value.isNullOrEmpty()) expression.value

        val resultExpression = Expression(_expression.value?.replace(".", "")).calculate()

        _result.value =
            if (resultExpression % 1.0 == 0.00) resultExpression.toLong().toString()
            else resultExpression.toString()
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
                val expressionWithoutSeparators = currentExpression.replace(".", "")

                val input =
                    IsValidInputDisplay.resolveParenthesisInput(expressionWithoutSeparators, value)

                val newExpression = expressionWithoutSeparators + input

                val formattedNumber = IsValidInputDisplay.formatNumberWithSeparators(newExpression)

                _expression.value = formattedNumber
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