package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.R

@Composable
fun TopNavigationBar(
    onHistoryClick: () -> Unit,
    onCameraClick: () -> Unit,
    onMeasuresCLick: () -> Unit,
    onBasicClick: () -> Unit,
    onAdvancedClick: () -> Unit,
    currentRoute: String?,
    hasHistory: Boolean
) {

    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TopBarIcon(
                icon = R.drawable.ic_clock,
                description = "History",
                currentRoute == "history",
                hasHistory,
            ) { onHistoryClick() }
            TopBarIcon(
                icon = R.drawable.ic_camera,
                description = "Camera",
                currentRoute == "camera"
            ) { onCameraClick }
            TopBarIcon(
                icon = R.drawable.ic_measures,
                description = "Measures",
                currentRoute == "measures"
            ) { onMeasuresCLick }
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            if (currentRoute == "advanced") {
                TopBarIcon(
                    icon = R.drawable.ic_basic_calculator,
                    description = "Calculator",
                    true
                ) {
                    onAdvancedClick()
                }
            } else {
                TopBarIcon(
                    icon = R.drawable.ic_advanced_calculator,
                    description = "Calculator",
                    currentRoute == "basic"
                ) {
                    onBasicClick()
                }
            }

        }
    }
}