package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.R
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val basicKeys = listOf(
    CalculatorKey(ButtonContent.Text("CE"), Primary, Secondary, ButtonType.FUNCTION, "CE"),
    CalculatorKey(ButtonContent.Text("C"), Primary, Secondary, ButtonType.FUNCTION, "C"),
    CalculatorKey(ButtonContent.Text("%"), Primary, Secondary, ButtonType.OPERATOR, "%"),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_divide),
        Primary,
        Secondary,
        ButtonType.OPERATOR,
        "/"
    ),

    CalculatorKey(ButtonContent.Text("7"), Secondary, Primary, ButtonType.NUMBER, "7"),
    CalculatorKey(ButtonContent.Text("8"), Secondary, Primary, ButtonType.NUMBER, "8"),
    CalculatorKey(ButtonContent.Text("9"), Secondary, Primary, ButtonType.NUMBER, "9"),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_multiply),
        Primary,
        Secondary,
        ButtonType.OPERATOR,
        "*"
    ),

    CalculatorKey(ButtonContent.Text("4"), Secondary, Primary, ButtonType.NUMBER, "4"),
    CalculatorKey(ButtonContent.Text("5"), Secondary, Primary, ButtonType.NUMBER, "5"),
    CalculatorKey(ButtonContent.Text("6"), Secondary, Primary, ButtonType.NUMBER, "6"),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_minus),
        Primary,
        Secondary,
        ButtonType.OPERATOR,
        "-"
    ),

    CalculatorKey(ButtonContent.Text("1"), Secondary, Primary, ButtonType.NUMBER, "1"),
    CalculatorKey(ButtonContent.Text("2"), Secondary, Primary, ButtonType.NUMBER, "2"),
    CalculatorKey(ButtonContent.Text("3"), Secondary, Primary, ButtonType.NUMBER, "3"),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_plus),
        Primary,
        Secondary,
        ButtonType.OPERATOR,
        "+"
    ),

    CalculatorKey(ButtonContent.Text("0"), Secondary, Primary, ButtonType.NUMBER, "0"),
    CalculatorKey(ButtonContent.Text(","), Secondary, Primary, ButtonType.GROUPING, ","),
    CalculatorKey(ButtonContent.Text("()"), Secondary, Primary, ButtonType.GROUPING, "()"),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_equals),
        Primary,
        Secondary,
        ButtonType.FUNCTION,
        "="
    ),
)