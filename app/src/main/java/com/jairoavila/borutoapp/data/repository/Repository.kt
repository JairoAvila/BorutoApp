package com.jairoavila.borutoapp.data.repository

import androidx.paging.PagingData
import com.jairoavila.borutoapp.domain.model.Hero
import com.jairoavila.borutoapp.domain.repository.DataStoreOperations
import com.jairoavila.borutoapp.domain.repository.RemoteDataSource
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val dataStore: DataStoreOperations,
) {

    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remoteDataSource.getAllHeroes()
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }

}