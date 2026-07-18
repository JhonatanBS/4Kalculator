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
fun TopNavigationBar() {
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
            TopBarIcon(icon = R.drawable.ic_clock, description = "History") {}
            TopBarIcon(icon = R.drawable.ic_camera, description = "Camera") {}
            TopBarIcon(icon = R.drawable.ic_measures, description = "Measures") {}
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TopBarIcon(icon = R.drawable.ic_calculator, description = "Calculator") {}
        }
    }
}