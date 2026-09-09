package com.example.fourkalculator.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fourkalculator.AdvancedCalculatorScreen
import com.example.fourkalculator.MainScreen
import com.example.fourkalculator.viewmodel.BasicCalculatorViewModel

@Composable
fun AppNavigation(viewModel: BasicCalculatorViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "basic") {
        composable("basic") {
            MainScreen(viewModel, onAdvancedClick = { navController.navigate("advanced") })
        }
        composable("advanced") {
            AdvancedCalculatorScreen()
        }
    }
}