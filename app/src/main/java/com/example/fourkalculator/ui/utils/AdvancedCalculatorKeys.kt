package com.example.fourkalculator.ui.utils

import com.example.fourkalculator.R
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

val advancedKeysLeft = listOf(
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_alter_buttons),
        Primary,
        Secondary,
        ButtonType.FUNCTION,
        ">"
    ),
    CalculatorKey(ButtonContent.Text("sin"), Secondary, Primary, ButtonType.FUNCTION, "sin"),
    CalculatorKey(ButtonContent.Text("cos"), Secondary, Primary, ButtonType.FUNCTION, "cos"),
    CalculatorKey(ButtonContent.Text("tan"), Secondary, Primary, ButtonType.FUNCTION, "tan"),

    CalculatorKey(ButtonContent.Text("e"), Secondary, Primary, ButtonType.FUNCTION, "exp"),
    CalculatorKey(ButtonContent.Text("ln"), Secondary, Primary, ButtonType.FUNCTION, "ln"),
    CalculatorKey(ButtonContent.Text("1/x"), Secondary, Primary, ButtonType.FUNCTION, "(1/"),
    CalculatorKey(ButtonContent.Text("log"), Secondary, Primary, ButtonType.FUNCTION, "lg"),

    CalculatorKey(ButtonContent.Text("eˣ"), Secondary, Primary, ButtonType.FUNCTION, "exp"),
    CalculatorKey(ButtonContent.Text("x²"), Secondary, Primary, ButtonType.FUNCTION, "x²"),
    CalculatorKey(ButtonContent.Text("xʸ"), Secondary, Primary, ButtonType.FUNCTION, "xʸ"),
    CalculatorKey(ButtonContent.Text("rad"), Secondary, Primary, ButtonType.FUNCTION, "rad"),

    CalculatorKey(ButtonContent.Text("|x|"), Secondary, Primary, ButtonType.FUNCTION, "abs"),
    CalculatorKey(ButtonContent.Text("π"), Secondary, Primary, ButtonType.FUNCTION, "pi"),
    CalculatorKey(ButtonContent.Text("√"), Secondary, Primary, ButtonType.FUNCTION, "sqrt"),
    CalculatorKey(ButtonContent.Text("+/-"), Secondary, Primary, ButtonType.FUNCTION, "+/-"),

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
        ButtonType.FUNCTION, "="
    ),
)

val advancedKeysRight = listOf(
    CalculatorKey(
        ButtonContent.Icon(R.drawable.ic_alter_buttons),
        Primary,
        Secondary,
        ButtonType.FUNCTION,
        "<"
    ),
    CalculatorKey(ButtonContent.Text("sin⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "asin"),
    CalculatorKey(ButtonContent.Text("cos⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "acos"),
    CalculatorKey(ButtonContent.Text("tan⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "atan"),

    CalculatorKey(ButtonContent.Text("2ˣ"), Secondary, Primary, ButtonType.FUNCTION, "2^"),
    CalculatorKey(ButtonContent.Text("x³"), Secondary, Primary, ButtonType.FUNCTION, "x³"),
    CalculatorKey(ButtonContent.Text("∛"), Secondary, Primary, ButtonType.FUNCTION, "∛"),
    CalculatorKey(ButtonContent.Text("x!"), Secondary, Primary, ButtonType.FUNCTION, "!"),

    CalculatorKey(ButtonContent.Text("sinh"), Secondary, Primary, ButtonType.FUNCTION, "sinh"),
    CalculatorKey(ButtonContent.Text("cosh"), Secondary, Primary, ButtonType.FUNCTION, "cosh"),
    CalculatorKey(ButtonContent.Text("tanh"), Secondary, Primary, ButtonType.FUNCTION, "tanh"),
    CalculatorKey(ButtonContent.Text("rad"), Secondary, Primary, ButtonType.FUNCTION, "rad"),

    CalculatorKey(ButtonContent.Text("sinh⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "asinh"),
    CalculatorKey(ButtonContent.Text("cosh⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "acosh"),
    CalculatorKey(ButtonContent.Text("tanh⁻¹"), Secondary, Primary, ButtonType.FUNCTION, "atanh"),
    CalculatorKey(ButtonContent.Text("+/-"), Secondary, Primary, ButtonType.FUNCTION, "+/-"),

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
        ButtonType.FUNCTION, "="
    ),
)