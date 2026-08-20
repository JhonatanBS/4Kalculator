package com.example.fourkalculator.helper

object IsValidInputDisplay {
    fun isLastCharacterOperator(value: String): Boolean {
        return value.lastOrNull() in setOf('/', '+', '*', '-')
    }

    fun resolveParenthesisInput(currentExpression: String?, value: String): String {
        val parentheses = mutableListOf<Char>()
        val lastChar = currentExpression?.lastOrNull()

        if (currentExpression == null) {
            return ""
        }

        for (char in currentExpression) {
            when (char) {
                '(' -> {
                    parentheses.add('(')
                }

                ')' -> {
                    if (parentheses.isNotEmpty()) {
                        parentheses.removeLast()
                    }

                }
            }
        }

        val hasOpenParenthesis = parentheses.isNotEmpty()

        if (lastChar == ')' &&
            (value.firstOrNull()?.isDigit() == true)
        ) {
            return "*$value"
        }

        if (value == "()") {
            return when {
                currentExpression.isEmpty() -> "("

                lastChar == '(' ||
                        lastChar == '+' ||
                        lastChar == '-' ||
                        lastChar == '*' ||
                        lastChar == '/' -> {
                    "("
                }

                hasOpenParenthesis &&
                        (lastChar?.isDigit() == true || lastChar == ')') -> ")"

                lastChar?.isDigit() == true || lastChar == ')' -> "*("

                else -> "("
            }
        }

        return value
    }

    fun formatNumberWithSeparators(currentExpression: String): String {
        var counterNumbers = 0
        val formattedNumber = StringBuilder()

        for (value in currentExpression.reversed()) {
            if (value.isDigit()) {
                if (counterNumbers != 0 && counterNumbers % 3 == 0) {
                    formattedNumber.append(".")
                }

                formattedNumber.append(value)
                counterNumbers++

            } else {
                counterNumbers = 0
                formattedNumber.append(value)
            }
        }
        return formattedNumber.reversed().toString()
    }

}