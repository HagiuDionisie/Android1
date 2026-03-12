package com.example.primaaplicatie.session4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.primaaplicatie.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoxImageText(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.silly_cat),
            contentDescription = "Image with a cat licking a lolipop",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "This cat is so silly",
            color = Color.Cyan,
            fontSize = 50.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 30.dp)

        )

        Text(
            text = "he is licking a lolipop.",
            color = Color.Cyan,
            fontSize = 40.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        )



    }
}