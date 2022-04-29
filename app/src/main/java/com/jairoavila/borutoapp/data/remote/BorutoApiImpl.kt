package com.jairoavila.borutoapp.data.remote

import com.jairoavila.borutoapp.domain.model.ApiResponse
import com.jairoavila.borutoapp.util.Constants.BASE_URL
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import javax.inject.Inject

class BorutoApiImpl @Inject constructor(
    private val client: HttpClient,
    private val urlBase: String = BASE_URL
) : BorutoApi {

    override suspend fun getAllHeroes(page: Int): ApiResponse =
        client.get("$urlBase/boruto/heroes") {
            parameter("page", page)
        }

    override suspend fun searchHeroes(name: String): ApiResponse =
        client.get("$urlBase/boruto/heroes/search") {
            parameter("name", name)
        }
}