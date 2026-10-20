package com.example.fourkalculator.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fourkalculator.AdvancedCalculatorScreen
import com.example.fourkalculator.HistoryCalculatorScreen
import com.example.fourkalculator.MainScreen
import com.example.fourkalculator.viewmodel.AdvancedCalculatorViewModel
import com.example.fourkalculator.viewmodel.BasicCalculatorViewModel
import com.example.fourkalculator.viewmodel.HistoryCalculatorViewModel

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavHost(navController = navController, startDestination = "basic") {
        composable("basic") {
            val viewModelBasic: BasicCalculatorViewModel = viewModel()

            MainScreen(
                viewModelBasic,
                currentRoute = currentRoute,
                onBasicClick = { navController.navigate("advanced") },
                onHistoryClick = { navController.navigate("history") },
                onCameraClick = {},
                onMeasuresClick = {},
                onAdvancedClick = {}
            )
        }
        composable("advanced") {
            val viewModelAdvanced: AdvancedCalculatorViewModel = viewModel()

            AdvancedCalculatorScreen(
                viewModelAdvanced,
                currentRoute = currentRoute,
                onBasicClick = {},
                onHistoryClick = { navController.navigate("history") },
                onCameraClick = {},
                onMeasuresClick = {},
                onAdvancedClick = { navController.navigate("basic") }
            )
        }

        composable("history") {
            val viewModelHistory: HistoryCalculatorViewModel = viewModel()

            HistoryCalculatorScreen(
                viewModelHistory,
                currentRoute = currentRoute,
                onBasicClick = { navController.navigate("basic") },
                onHistoryClick = {},
                onCameraClick = {},
                onMeasuresClick = {},
                onAdvancedClick = { navController.navigate("advanced") }
            )
        }
    }
}