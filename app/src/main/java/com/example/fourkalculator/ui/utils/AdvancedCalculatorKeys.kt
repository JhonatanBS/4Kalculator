package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val advancedKeys = listOf(
    CalculatorKey("CE", Primary, Secondary, ButtonType.FUNCTION),
    CalculatorKey("sin", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("cos", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("tan", Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey("+/-", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("ln", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("rad", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("log", Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey("eˣ", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("x²", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("xʸ", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("1/x", Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey("|x|", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("π", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("√", Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey("e", Secondary, Primary, ButtonType.FUNCTION),

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