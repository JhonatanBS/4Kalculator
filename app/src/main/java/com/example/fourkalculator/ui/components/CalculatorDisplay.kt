package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary

@Composable
fun CalculatorDisplay(
    expression: String,
    result: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = expression,
            style = MaterialTheme.typography.headlineLarge,
            color = Secondary,
        )

        Row(
            Modifier
                .fillMaxWidth()
                .height(112.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "=",
                style = MaterialTheme.typography.displayLarge,
                color = Primary,
            )
            Text(
                text = result,
                style = MaterialTheme.typography.displayLarge,
                color = Primary,
            )
        }


    }
}