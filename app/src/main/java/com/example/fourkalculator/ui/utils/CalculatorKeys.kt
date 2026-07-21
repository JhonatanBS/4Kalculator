package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val keys = listOf(
    CalculatorKey("CE", Primary, Secondary),
    CalculatorKey("C", Primary, Secondary),
    CalculatorKey("%", Primary, Secondary),
    CalculatorKey("/", Primary, Secondary),

    CalculatorKey("7", Secondary, Primary),
    CalculatorKey("8", Secondary, Primary),
    CalculatorKey("9", Secondary, Primary),
    CalculatorKey("x", Primary, Secondary),

    CalculatorKey("4", Secondary, Primary),
    CalculatorKey("5", Secondary, Primary),
    CalculatorKey("6", Secondary, Primary),
    CalculatorKey("-", Primary, Secondary),

    CalculatorKey("1", Secondary, Primary),
    CalculatorKey("2", Secondary, Primary),
    CalculatorKey("3", Secondary, Primary),
    CalculatorKey("+", Primary, Secondary),

    CalculatorKey("0", Secondary, Primary),
    CalculatorKey(",", Secondary, Primary),
    CalculatorKey("()", Secondary, Primary),
    CalculatorKey("=", Primary, Secondary),
)