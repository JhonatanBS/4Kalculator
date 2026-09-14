package com.example.fourkalculator.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fourkalculator.ui.utils.ButtonContent

@Composable
fun AdvancedCalculatorButton(
    content: ButtonContent,
    backgroundColor: Color,
    onClick: () -> Unit,
    textColor: Color,
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(40.dp)
            .width(63.dp),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues.Zero,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor)
    ) {
        when (content) {
            is ButtonContent.Text -> {
                Text(
                    text = content.text,
                    fontSize = 18.sp,
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
                    modifier = Modifier.size(18.dp),
                    tint = textColor
                )
            }
        }
    }
}