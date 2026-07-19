package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.fourkalculator.ui.components.CalculatorDisplay
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FourKalculatorTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    ScreenContainer {
        TopNavigationBar()
        CalculatorDisplay(expression = "4+4", result = "8")
    }
}

