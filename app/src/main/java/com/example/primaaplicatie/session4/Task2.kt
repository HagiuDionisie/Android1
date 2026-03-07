package com.example.primaaplicatie.session4

import android.R.attr.text
import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.*
import androidx.compose.ui.graphics.Color


@Composable
fun LogButton() {
    Button(onClick = {Log.d("Session4","Clicked")},
        modifier = Modifier.padding(all= 100.dp))
    {
        Text(
            text = "Press me!",
            color = Color.Red
        )
    }
}