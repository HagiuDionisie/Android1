package com.example.primaaplicatie.session4

import android.R.attr.left
import android.R.attr.top
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp

@Composable
fun GreetingCard(name: String) {
    Text(
        text = "Hello $name",
        color = Color.Blue,
        modifier = Modifier.padding(top = 50.dp, start = 30.dp)

    )
}