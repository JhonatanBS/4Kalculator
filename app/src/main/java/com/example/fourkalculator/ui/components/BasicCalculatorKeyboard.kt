package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.utils.ButtonType
import com.example.fourkalculator.ui.utils.basicKeys

@Composable
fun BasicCalculatorKeyboard(onKeyClick: (String, ButtonType) -> Unit) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        Arrangement.spacedBy(12.dp),
    ) {
        basicKeys.chunked(4).forEach { rowKeys ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                rowKeys.forEach { key ->
                    BasicCalculatorButton(
                        content = key.label,
                        backgroundColor = key.background,
                        onClick = { onKeyClick(key.label.toString(), key.typeButton) },
                        textColor = key.textColor
                    )
                }
            }
        }
    }
}