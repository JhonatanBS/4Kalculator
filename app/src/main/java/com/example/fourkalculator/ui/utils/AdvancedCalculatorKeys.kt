package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.R
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val advancedKeys = listOf(
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_alter_buttons),
        Primary,
        Secondary,
        ButtonType.FUNCTION
    ),
    CalculatorKey(ButtonContent.Text("sin"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("cos"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("tan"), Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey(ButtonContent.Text("+/-"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("ln"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("rad"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("log"), Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey(ButtonContent.Text("eˣ"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("x²"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("xʸ"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("1/x"), Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey(ButtonContent.Text("|x|"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("π"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("√"), Secondary, Primary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("e"), Secondary, Primary, ButtonType.FUNCTION),

    CalculatorKey(ButtonContent.Text("CE"), Primary, Secondary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("C"), Primary, Secondary, ButtonType.FUNCTION),
    CalculatorKey(ButtonContent.Text("%"), Primary, Secondary, ButtonType.OPERATOR),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_divide),
        Primary,
        Secondary,
        ButtonType.OPERATOR
    ),

    CalculatorKey(ButtonContent.Text("7"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("8"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("9"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_multiply),
        Primary,
        Secondary,
        ButtonType.OPERATOR
    ),

    CalculatorKey(ButtonContent.Text("4"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("5"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("6"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Icon(R.drawable.ic_minus), Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey(ButtonContent.Text("1"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("2"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text("3"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Icon(R.drawable.ic_plus), Primary, Secondary, ButtonType.OPERATOR),

    CalculatorKey(ButtonContent.Text("0"), Secondary, Primary, ButtonType.NUMBER),
    CalculatorKey(ButtonContent.Text(","), Secondary, Primary, ButtonType.GROUPING),
    CalculatorKey(ButtonContent.Text("()"), Secondary, Primary, ButtonType.GROUPING),
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_equals),
        Primary,
        Secondary,
        ButtonType.FUNCTION
    ),
)