package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.utils.CalculationHistory

@Composable
fun CalculationHistoryList(history: List<CalculationHistory>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(top = 50.dp),
    ) {
        items(
            items = history,
            key = { it.expression }) { calculation ->
            CalculationHistoryItem(calculation)
        }
    }
}