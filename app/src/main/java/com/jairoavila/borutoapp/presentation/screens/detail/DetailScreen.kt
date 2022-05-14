package com.jairoavila.borutoapp.presentation.screens.detail

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@ExperimentalMaterialApi
@Composable
fun DetailScreen(
    navController: NavHostController,
    detailsViewModel: DetailViewModel = hiltViewModel()
) {
    val selectedHero by detailsViewModel.selectedHero.collectAsState()

    DetailsContent(
        navController = navController,
        selectedHero = selectedHero
    )
}