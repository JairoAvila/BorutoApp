package com.jairoavila.borutoapp.domain.use_cases

import androidx.paging.PagingData
import com.jairoavila.borutoapp.data.repository.Repository
import com.jairoavila.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }

}