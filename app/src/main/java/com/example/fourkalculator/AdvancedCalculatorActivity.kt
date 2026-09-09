package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.theme.FourKalculatorTheme

class AdvancedCalculatorActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            FourKalculatorTheme {
                AdvancedCalculatorScreen()
            }
        }
    }
}

@Composable
fun AdvancedCalculatorScreen() {
    ScreenContainer {
        //TopNavigationBar()
    }
}