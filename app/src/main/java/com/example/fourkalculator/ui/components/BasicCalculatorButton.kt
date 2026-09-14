package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import com.example.fourkalculator.ui.utils.ButtonContent

@Composable
fun BasicCalculatorButton(
    content: ButtonContent,
    backgroundColor: Color,
    onClick: () -> Unit,
    textColor: Color,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.size(86.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
    ) {
        when (content) {
            is ButtonContent.Text -> {
                Text(
                    text = content.text,
                    fontSize = 32.sp,
                    color = textColor,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineLarge
                )
            }

            is ButtonContent.Icon -> {
                Icon(
                    painter = painterResource(content.iconPath),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp),
                    tint = textColor
                )
            }
        }
    }
}