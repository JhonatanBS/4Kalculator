package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.ui.theme.Secondary

@Composable
fun TopBarIcon(icon: Int, description: String, onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
    )
    {
        Icon(
            painter = painterResource(icon),
            contentDescription = description,
            tint = Secondary,
            modifier = Modifier
                .size(24.dp)
        )
    }
}