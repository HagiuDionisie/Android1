package com.example.primaaplicatie.session6

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


@Composable
fun HomeScreen(onNavigateToDetail: (Int) -> Unit){

    Column(modifier = Modifier.fillMaxSize().padding(34.dp)){
        Text(text = "Home", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Text("List of Items:")
        val itemList = (1..10).toList()

        LazyColumn (modifier = Modifier.weight(1f)){
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
        Spacer(modifier = Modifier.height(16.dp))
    }


}


















