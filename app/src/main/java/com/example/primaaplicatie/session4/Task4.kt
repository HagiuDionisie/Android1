package com.example.primaaplicatie.session4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextCollumn(){
    Column(modifier = Modifier.padding(all = 40.dp)) {
        Text(text = "first text")
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "second text")
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "third text")
        Spacer(modifier = Modifier.height(15.dp))
    }
}





