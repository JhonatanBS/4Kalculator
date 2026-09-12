package com.example.fourkalculator.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fourkalculator.AdvancedCalculatorScreen
import com.example.fourkalculator.MainScreen
import com.example.fourkalculator.viewmodel.AdvancedCalculatorViewModel
import com.example.fourkalculator.viewmodel.BasicCalculatorViewModel

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "basic") {
        composable("basic") {
             val viewModelBasic: BasicCalculatorViewModel = viewModel()

            MainScreen(viewModelBasic, onAdvancedClick = { navController.navigate("advanced") })
        }
        composable("advanced") {
            val viewModelAdvanced: AdvancedCalculatorViewModel = viewModel()

            AdvancedCalculatorScreen(viewModelAdvanced, onBasicClick = { navController.popBackStack()})
        }
    }
}