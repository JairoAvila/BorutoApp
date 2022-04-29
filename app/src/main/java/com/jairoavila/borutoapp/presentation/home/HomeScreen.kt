package com.jairoavila.borutoapp.presentation.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.jairoavila.borutoapp.presentation.components.RatingWidget
import com.jairoavila.borutoapp.ui.theme.LARGE_PADDING

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
    ) {
        RatingWidget(
            modifier = Modifier.padding(all = LARGE_PADDING),
            rating = 0.5
        )
    }
}