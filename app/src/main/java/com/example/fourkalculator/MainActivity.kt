package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.fourkalculator.ui.components.CalculatorDisplay
import com.example.fourkalculator.ui.components.CalculatorKeyboard
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme
import com.example.fourkalculator.viewmodel.BasicCalculatorViewModel

class MainActivity : ComponentActivity() {
    private val viewlModel: BasicCalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            FourKalculatorTheme {
                MainScreen(viewlModel)
            }
        }
    }
}

@Composable
fun MainScreen(viewlModel: BasicCalculatorViewModel) {
    val expression by viewlModel.expression.observeAsState("")
    val result by viewlModel.result.observeAsState("")

    ScreenContainer {
        TopNavigationBar()

        CalculatorDisplay(expression = expression, result = result)

        CalculatorKeyboard(onKeyClick  = { value, type -> viewlModel.handleKeyInput(value, type)})
    }
}

