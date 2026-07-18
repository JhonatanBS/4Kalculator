package com.example.fourkalculator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fourkalculator.R

val Baloo2 = FontFamily(
    Font(R.font.baloo2_regular, FontWeight.Normal),
    Font(R.font.baloo2_medium, FontWeight.Medium),
    Font(R.font.baloo2_semibold, FontWeight.SemiBold),
    Font(R.font.baloo2_bold, FontWeight.Bold),
    Font(R.font.baloo2_extrabold, FontWeight.ExtraBold)
)

val Typography = Typography(

    // Display
   displayLarge = TextStyle(
       fontFamily = Baloo2,
       fontWeight = FontWeight.Bold,
       fontSize = 56.sp
   ),

    // Headlines
    headlineLarge = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp
    ),

    // Titles
    titleLarge = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),

    titleMedium = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp
    ),

    // Body
    bodyLarge = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 26.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    // Labels
    labelLarge = TextStyle(
        fontFamily = Baloo2,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
)