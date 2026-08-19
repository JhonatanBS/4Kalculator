package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val keys = listOf(
    CalculatorKey("CE", Primary, Secondary, ButtonType.FUNCTION),
    CalculatorKey("C", Primary, Secondary, ButtonType.FUNCTION),
    CalculatorKey("%", Primary, Secondary, ButtonType.OPERATOR),
    CalculatorKey("/", Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey("7", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("8", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("9", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("*", Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey("4", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("5", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("6", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("-", Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey("1", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("2", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("3", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey("+", Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey("0", Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(",", Secondary, Primary, ButtonType.GROUPING),
    CalculatorKey("()", Secondary, Primary, ButtonType.GROUPING),
    CalculatorKey("=", Primary, Secondary, ButtonType.FUNCTION),
)