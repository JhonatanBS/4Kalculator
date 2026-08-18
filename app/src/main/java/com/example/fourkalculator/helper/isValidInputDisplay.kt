package com.example.fourkalculator.helper

class IsValidInputDisplay {
    fun isLastCharacterOperator(value: String): Boolean {
        return value.lastOrNull() in setOf('/', '+', '*', '-')
    }
}