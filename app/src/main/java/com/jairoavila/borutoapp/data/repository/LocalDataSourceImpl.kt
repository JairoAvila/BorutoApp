package com.jairoavila.borutoapp.data.repository

import com.jairoavila.borutoapp.data.local.BorutoDatabase
import com.jairoavila.borutoapp.domain.model.Hero
import com.jairoavila.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(
    private val borutoDatabase: BorutoDatabase
) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}