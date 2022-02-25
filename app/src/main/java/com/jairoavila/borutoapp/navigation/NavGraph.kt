package com.jairoavila.borutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.accompanist.pager.ExperimentalPagerApi
import com.jairoavila.borutoapp.presentation.home.HomeScreen
import com.jairoavila.borutoapp.presentation.splash.SplashScreen
import com.jairoavila.borutoapp.presentation.welcome.WelcomeScreen
import com.jairoavila.borutoapp.util.Constants

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(Constants.DETAILS_ARGUMENT_KEY){
                type = NavType.IntType
            })
        ) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}