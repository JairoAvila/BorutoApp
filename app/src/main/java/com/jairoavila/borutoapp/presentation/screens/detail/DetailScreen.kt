package com.jairoavila.borutoapp.presentation.screens.detail

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(
    navController: NavHostController,
    detailsViewModel: DetailViewModel = hiltViewModel()
) {

    val selectedHero = detailsViewModel.selectedHero

}