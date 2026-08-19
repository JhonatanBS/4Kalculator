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

}