package com.example.fourkalculator.helper

object IsValidInputDisplay {
    fun isLastCharacterOperator(value: String): Boolean {
        return value.lastOrNull() in setOf('/', '+', '*', '-')
    }

    fun isValidParentheses(value: String): Boolean {
        // validação
        return true
    }

}