package com.example.primaaplicatie.session6

import android.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable


@Serializable
object Home

@Serializable
data class Detail(val id: Int)

@Composable
fun HomeScreen(onNavigateToDetail: (Int) -> Unit){

    Column(modifier = Modifier.fillMaxSize().padding(35.dp)){
        Text(text = "Home", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(15.dp))

        Text("List of Items:")
        val itemList = (1..10).toList()

        LazyColumn {
            items(itemList){item ->
                Text(
                    text = "Item $item",
                    modifier = Modifier.fillMaxWidth()
                        .clickable{onNavigateToDetail(item)}
                        .padding(20.dp)
                )
            }
        }
        Button(onClick = {onNavigateToDetail(123)}){
            Text("Go to Detail123")
        }
        Spacer(modifier = Modifier.height(15.dp))
    }


}

@Composable
fun DetailScreen(id:Int, onGoBack: () -> Unit){
    Column(modifier = Modifier.fillMaxSize().padding(35.dp)){
        Text(text = "Detail Screen",
            style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Received ID: $id")

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = onGoBack){
            Text("Go back")
        }
    }
}

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














