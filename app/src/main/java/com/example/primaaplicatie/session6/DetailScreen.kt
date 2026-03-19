package com.example.primaaplicatie.session6

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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