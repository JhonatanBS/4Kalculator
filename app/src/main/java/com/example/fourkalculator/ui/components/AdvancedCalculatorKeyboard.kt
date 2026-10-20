package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.utils.ButtonType
import com.example.fourkalculator.ui.utils.advancedKeysLeft
import com.example.fourkalculator.ui.utils.advancedKeysRight

@Composable
fun AdvancedCalculatorKeyboard(
    onKeyClick: (String, ButtonType) -> Unit,
    isActivated: Boolean = false
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 0.dp),
        Arrangement.spacedBy(14.dp),
    ) {

        if (!isActivated) {
            advancedKeysLeft.chunked(4).forEach { rowKeys ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    rowKeys.forEach { key ->
                        AdvancedCalculatorButton(
                            content = key.label,
                            backgroundColor = key.background,
                            onClick = { onKeyClick(key.value, key.typeButton) },
                            textColor = key.textColor
                        )
                    }
                }
            }
        } else {
            advancedKeysRight.chunked(4).forEach { rowKeys ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    rowKeys.forEach { key ->
                        AdvancedCalculatorButton(
                            content = key.label,
                            backgroundColor = key.background,
                            onClick = { onKeyClick(key.value, key.typeButton) },
                            textColor = key.textColor
                        )
                    }
                }
            }
        }

    }
}