package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.utils.CalculationHistory

@Composable
fun CalculationHistoryList(history: List<CalculationHistory>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .padding(horizontal = 9.dp, vertical = 40.dp)
            .drawBehind {
                drawLine(
                    color = Primary,
                    start = Offset(size.width, 0f),
                    end = Offset(size.width, size.height),
                    strokeWidth = 3.dp.toPx()
                )
            },
    ) {
        itemsIndexed(
            items = history,
            key = { index, _ -> index }
        ) { _, calculation ->
            CalculationHistoryItem(calculation)
        }
    }
}