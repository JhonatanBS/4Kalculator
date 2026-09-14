package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.fourkalculator.navigation.AppNavigation
import com.example.fourkalculator.ui.components.BasicCalculatorKeyboard
import com.example.fourkalculator.ui.components.CalculatorDisplay
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme
import com.example.fourkalculator.viewmodel.BasicCalculatorViewModel

class MainActivity : ComponentActivity() {

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
fun MainScreen(viewModel: BasicCalculatorViewModel, currentRoute: String? ,onAdvancedClick: () -> Unit) {
    val expression by viewModel.expression.observeAsState("")
    val result by viewModel.result.observeAsState("")

    ScreenContainer {
        TopNavigationBar(onAdvancedClick, currentRoute)

        CalculatorDisplay(expression = expression, result = result)

        BasicCalculatorKeyboard(onKeyClick  = { value, type -> viewModel.handleKeyInput(value, type)})
    }
}

