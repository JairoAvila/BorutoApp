package com.jairoavila.borutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jairoavila.borutoapp.data.local.BorutoDatabase
import com.jairoavila.borutoapp.data.remote.BorutoApi
import com.jairoavila.borutoapp.data.repository.LocalDataSourceImpl
import com.jairoavila.borutoapp.data.repository.RemoteDataSourceImpl
import com.jairoavila.borutoapp.domain.repository.LocalDataSource
import com.jairoavila.borutoapp.domain.repository.RemoteDataSource
import com.jairoavila.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): BorutoDatabase =
        Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()

    @Provides
    @Singleton
    fun provideLocalDataSource(
        borutoDatabase: BorutoDatabase
    ): LocalDataSource {
        return LocalDataSourceImpl(
            borutoDatabase = borutoDatabase
        )
    }
}