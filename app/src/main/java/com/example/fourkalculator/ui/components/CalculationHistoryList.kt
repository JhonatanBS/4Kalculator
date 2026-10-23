package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.utils.CalculationHistory

@Composable
fun CalculationHistoryList(history: List<CalculationHistory>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(top = 50.dp),
    ) {
        itemsIndexed(
            items = history,
            key = { index, _ -> index }
        ) { _, calculation ->
            CalculationHistoryItem(calculation)
        }
    }
}