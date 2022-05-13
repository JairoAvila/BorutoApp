package com.jairoavila.borutoapp.domain.repository

import com.jairoavila.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}