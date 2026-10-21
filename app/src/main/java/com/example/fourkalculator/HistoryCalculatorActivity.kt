package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.fourkalculator.navigation.AppNavigation
import com.example.fourkalculator.ui.components.CalculationHistoryList
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme
import com.example.fourkalculator.ui.utils.CalculationHistory
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
        CalculationHistoryList(history)
    }
}

val history = listOf(
    CalculationHistory("25 + 15", "40"),
    CalculationHistory("120 - 45", "75"),
    CalculationHistory("12 * 8", "96"),
    CalculationHistory("144 / 12", "12"),
    CalculationHistory("2 ^ 10", "1024"),
    CalculationHistory("sqrt(81)", "9"),
    CalculationHistory("sin(30)", "0.5"),
    CalculationHistory("cos(60)", "0.5"),
    CalculationHistory("5 * (3 + 7)", "50"),
    CalculationHistory("100 / (2 + 3)", "20")
)