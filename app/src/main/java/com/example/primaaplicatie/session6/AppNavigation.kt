package com.example.primaaplicatie.session6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController =  navController,
        startDestination = Home
    ){
        composable<Home>{
            HomeScreen(
                onNavigateToDetail = {id -> navController.navigate(Detail(id = id))}
            )
        }
        composable<Detail>
        {
                backStackEntry ->
            val args = backStackEntry.toRoute<Detail>()

            DetailScreen(
                id = args.id,
                onGoBack = {navController.popBackStack()}
            )
        }
    }


}