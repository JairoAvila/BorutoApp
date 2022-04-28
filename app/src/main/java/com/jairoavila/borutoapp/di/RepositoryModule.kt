package com.jairoavila.borutoapp.di

import android.content.Context
import com.jairoavila.borutoapp.data.pref.DataStoreOperationsImpl
import com.jairoavila.borutoapp.data.repository.Repository
import com.jairoavila.borutoapp.domain.repository.DataStoreOperations
import com.jairoavila.borutoapp.domain.use_cases.GetAllHeroesUseCase
import com.jairoavila.borutoapp.domain.use_cases.ReadOnBoardingUseCase
import com.jairoavila.borutoapp.domain.use_cases.SaveOnBoardingUseCase
import com.jairoavila.borutoapp.domain.use_cases.UseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(@ApplicationContext context: Context): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository)
        )
    }
}