package com.example.fourkalculator.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.fourkalculator.data.local.DataStoreManager
import com.example.fourkalculator.ui.utils.CalculationHistory
import kotlinx.coroutines.flow.first
import kotlinx.serialization.json.Json

class HistoryRepository(context: Context) {

    private val dataStore =
        DataStoreManager.getDataStore(context.applicationContext)

    private val historyKey = stringPreferencesKey("Calculation_history")

    private val json = Json

    suspend fun insertCalculation(expression: String, result: String) {
        dataStore.edit { preferences ->
            val currentHistory = preferences[historyKey]
                ?.let {
                    json.decodeFromString<List<CalculationHistory>>(it)
                }
                ?: emptyList()

            val updateHistory = listOf(CalculationHistory(expression, result)) + currentHistory

            preferences[historyKey] = json.encodeToString(updateHistory)
        }
    }

    suspend fun getHistory(): List<CalculationHistory> {
        val preferences = dataStore.data.first()

        return preferences[historyKey]
            ?.let {
                json.decodeFromString<List<CalculationHistory>>(it)
            }
            ?: emptyList()
    }

    suspend fun clearAllHistory() {
        dataStore.edit { preferences ->
            preferences.remove(historyKey)
        }
    }
}