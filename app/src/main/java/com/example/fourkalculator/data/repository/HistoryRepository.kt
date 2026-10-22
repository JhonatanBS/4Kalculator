package com.example.fourkalculator.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.fourkalculator.data.local.DataStoreManager
import kotlinx.coroutines.flow.first

class HistoryRepository(context: Context) {

    private val dataStore =
        DataStoreManager.getDataStore(context.applicationContext)

    suspend fun addCalculation(key: String, value: String) {
        val preferencesKey = stringPreferencesKey(key)

        dataStore.edit { preferences ->
            preferences[preferencesKey] = value
        }
    }

    suspend fun getHistory(key: String): String {
        val preferencesKey = stringPreferencesKey(key)
        val preferences = dataStore.data.first()

        return preferences[preferencesKey] ?: ""
    }

    suspend fun clearHistory(key: String) {
        val preferencesKey = stringPreferencesKey(key)

        dataStore.edit { preferences ->
            preferences.remove(preferencesKey)
        }
    }
}
