package com.example.fourkalculator.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "calculator_preferences")

object DataStoreManager {
    fun getDataStore(context: Context): DataStore<Preferences> {
        return context.dataStore
    }
}