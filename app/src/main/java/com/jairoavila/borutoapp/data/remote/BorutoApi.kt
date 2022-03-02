package com.jairoavila.borutoapp.data.remote

import com.jairoavila.borutoapp.domain.model.ApiResponse

interface BorutoApi {
    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String): ApiResponse
}