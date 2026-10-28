package com.example.fourkalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fourkalculator.data.repository.HistoryRepository
import com.example.fourkalculator.helper.IsValidInputDisplay
import com.example.fourkalculator.ui.utils.ButtonType
import kotlinx.coroutines.launch
import org.mariuszgromada.math.mxparser.Expression

class BasicCalculatorViewModel(private val repository: HistoryRepository) : ViewModel() {

    private val _expression = MutableLiveData("")
    val expression: LiveData<String> = _expression

    private val _result = MutableLiveData("0")
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
        val originalExpression = _expression.value.orEmpty()

        if (originalExpression.isEmpty()) {
            _expression.value = "0"
            return
        }

        val resultExpression = Expression(originalExpression.replace(",", "")).calculate()

        if (!resultExpression.isFinite()) return

        val formattedResult =
            if (resultExpression % 1.0 == 0.00) resultExpression.toLong().toString()
            else resultExpression.toString()

        viewModelScope.launch {
            repository.insertCalculation(
                expression = originalExpression,
                result = formattedResult
            )
        }

        _expression.value = formattedResult
        _result.value = formattedResult
    }

    private fun clearLastInput() {
        val currentExpression = _expression.value ?: return

        if (currentExpression.isEmpty() || currentExpression.length == 1) {
            _result.value = "0"
        }

        _expression.value = currentExpression.dropLast(1)
    }

    fun addInputValue(value: String, type: ButtonType) {
        val currentExpression = _expression.value.orEmpty()

        _result.value = "0"

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
                    currentExpression.isEmpty() && (value == "/" || value == "*" || value == "%")

                if (!isLastOperator && !isInvalidFirstOperator) {
                    _expression.value = currentExpression + value
                } else {
                    return
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
        _result.value = "0"
    }
}