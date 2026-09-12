package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.fourkalculator.navigation.AppNavigation
import com.example.fourkalculator.ui.components.CalculatorDisplay
import com.example.fourkalculator.ui.components.CalculatorKeyboard
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
fun MainScreen(viewlModel: BasicCalculatorViewModel, onAdvancedClick: () -> Unit) {
    val expression by viewlModel.expression.observeAsState("")
    val result by viewlModel.result.observeAsState("")

    ScreenContainer {
        TopNavigationBar(onAdvancedClick)

        CalculatorDisplay(expression = expression, result = result)

        CalculatorKeyboard(onKeyClick  = { value, type -> viewlModel.handleKeyInput(value, type)})
    }
}

