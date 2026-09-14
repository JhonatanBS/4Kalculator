package com.example.fourkalculator.ui.utils

import androidx.compose.ui.graphics.Color

sealed class ButtonContent {
    data class Text(val text: String) : ButtonContent()
    data class Icon(val iconPath: Int) : ButtonContent()
}

data class CalculatorKey(
    val label: ButtonContent,
    val background: Color,
    val textColor: Color,
    val typeButton: ButtonType,
    val value: String
)