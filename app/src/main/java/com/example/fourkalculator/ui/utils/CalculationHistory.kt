package com.example.fourkalculator.ui.utils

import kotlinx.serialization.Serializable

@Serializable
data class CalculationHistory(
    val expression: String,
    val result: String
)