package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.fourkalculator.navigation.AppNavigation
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme
import com.example.fourkalculator.viewmodel.HistoryCalculatorViewModel

class HistoryCalculatorActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            FourKalculatorTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun HistoryCalculatorScreen(
    viewModel: HistoryCalculatorViewModel,
    currentRoute: String?,
    onHistoryClick: () -> Unit,
    onCameraClick: () -> Unit,
    onMeasuresClick: () -> Unit,
    onBasicClick: () -> Unit,
    onAdvancedClick: () -> Unit,
) {
    ScreenContainer {
        TopNavigationBar(
            onHistoryClick,
            onCameraClick,
            onMeasuresClick,
            onBasicClick,
            onAdvancedClick,
            currentRoute
        )
    }
}