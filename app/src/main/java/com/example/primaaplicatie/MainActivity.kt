package com.example.primaaplicatie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primaaplicatie.session4.BoxImageText
import com.example.primaaplicatie.session4.CircleShaper
import com.example.primaaplicatie.session4.GreetingCard
import com.example.primaaplicatie.session4.IconTextRow
import com.example.primaaplicatie.session4.InteractiveButton
import com.example.primaaplicatie.session4.LogButton
import com.example.primaaplicatie.session4.ProfileCard
import com.example.primaaplicatie.session4.ScrollableList
import com.example.primaaplicatie.session4.TextCollumn
import com.example.primaaplicatie.session5.BrokenCheckbox
import com.example.primaaplicatie.session5.HoistingParent
import com.example.primaaplicatie.session5.LaunchedEffectTask
import com.example.primaaplicatie.session5.LightSwitch
import com.example.primaaplicatie.session5.SaveableTask
import com.example.primaaplicatie.session5.ScrollButton
import com.example.primaaplicatie.session5.TextFieldTask
import com.example.primaaplicatie.session5.ValidationTask
import com.example.primaaplicatie.session5.WorkingCheckbox
import com.example.primaaplicatie.ui.theme.PrimaAplicatieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            //GreetingCard(name = "Dionisie")

            //LogButton()

            //IconTextRow()

            //TextCollumn()

            //(uncomment for a silly cat)
            //BoxImageText()

            //CircleShaper()

            //InteractiveButton()

            //ScrollableList()

            //ProfileCard()

            //Homework for Session 5 starts here!

            //BrokenCheckbox()

            //WorkingCheckbox()

            //TextFieldTask()

            //HoistingParent()

            //ValidationTask()

            //LightSwitch()

            //SaveableTask()

            //ScrollButton()

            //LaunchedEffectTask()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimaAplicatieTheme {
        Greeting("Android")
    }
}