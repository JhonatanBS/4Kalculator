package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary
import com.example.fourkalculator.ui.utils.CalculationHistory

@Composable
fun CalculationHistoryItem(item: CalculationHistory) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(),
        horizontalArrangement = Arrangement.End) {
        Text(
            text = item.expression + " = ",
            style = MaterialTheme.typography.headlineLarge,
            color = Primary,
        )

        Text(
            text = item.result,
            style = MaterialTheme.typography.headlineLarge,
            color = Secondary,
        )
    }
}