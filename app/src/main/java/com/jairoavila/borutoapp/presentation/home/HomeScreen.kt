package com.jairoavila.borutoapp.presentation.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {

    val allHeroes = viewModel.getAllHeroes.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {})
        }
    ) {}
}