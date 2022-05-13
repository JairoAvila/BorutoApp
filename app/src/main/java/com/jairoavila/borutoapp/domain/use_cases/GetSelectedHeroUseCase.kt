package com.jairoavila.borutoapp.domain.use_cases

import com.jairoavila.borutoapp.data.repository.Repository
import com.jairoavila.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}