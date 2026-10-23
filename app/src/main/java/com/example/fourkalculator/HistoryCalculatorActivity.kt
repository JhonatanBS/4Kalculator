package com.example.fourkalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.fourkalculator.navigation.AppNavigation
import com.example.fourkalculator.ui.components.CalculationHistoryList
import com.example.fourkalculator.ui.components.ScreenContainer
import com.example.fourkalculator.ui.components.TopNavigationBar
import com.example.fourkalculator.ui.theme.FourKalculatorTheme
import com.example.fourkalculator.ui.theme.Primary
import com.example.fourkalculator.ui.theme.Secondary
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
    currentRoute: String?, hasHistory: Boolean,
    onHistoryClick: () -> Unit,
    onCameraClick: () -> Unit,
    onMeasuresClick: () -> Unit,
    onBasicClick: () -> Unit,
    onAdvancedClick: () -> Unit,
    onClearHistoryClick: () -> Unit
) {
    val history by viewModel.history.collectAsState()

    ScreenContainer {
        TopNavigationBar(
            onHistoryClick,
            onCameraClick,
            onMeasuresClick,
            onBasicClick,
            onAdvancedClick,
            currentRoute,
            hasHistory,
        )
        CalculationHistoryList(
            history, modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        )

        Button(
            onClick = onClearHistoryClick,
            modifier = Modifier
                .height(50.dp)
                .width(219.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Primary
            )
        ) {
            Text(
                text = "Limpar Histórico",
                style = MaterialTheme.typography.bodyLarge,
                color = Secondary,
                textAlign = TextAlign.Center
            )
        }
    }
}