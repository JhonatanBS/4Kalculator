package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.utils.keys

@Composable
fun CalculatorKeyboard() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        Arrangement.spacedBy(12.dp),
    ) {
        keys.chunked(4).forEach { rowKeys ->
           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               rowKeys.forEach { key ->
                   CalculatorButton(
                       label = key.label,
                       backgroundColor = key.background,
                       onClick = {},
                       textColor = key.textColor
                   )
               }
           }
        }
    }
}