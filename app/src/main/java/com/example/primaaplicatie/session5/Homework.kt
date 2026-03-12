package com.example.primaaplicatie.session5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

//Task1

@Composable
fun BrokenCheckbox(){

    var isChecked = false;
    Row(modifier = Modifier.padding(100.dp)) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
    }
}

//Task2

@Composable
fun WorkingCheckbox(){
    var isChecked by remember { mutableStateOf(false) }
    Row(modifier = Modifier.padding(100.dp)) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
    }
}

//Task3

@Composable
fun TextFieldTask(){
    var text by remember {mutableStateOf("")}
    Column(modifier = Modifier.padding(100.dp)){
        TextField(
            value = text,
            onValueChange = {text = it},
            label = {Text("Write something.")}
        )
        Text("You have written: $text")
    }
}

//Task 4
@Composable
fun StatelessTextField(text: String, onTextChange: (String) -> Unit) {
    TextField(
        value = text,
        onValueChange = onTextChange
    )
}

@Composable
fun HoistingParent(){
    var text by remember {mutableStateOf("")}
    Row(modifier = Modifier.padding(100.dp)) {
        StatelessTextField(
            text = text,
            onTextChange = { text = it }
        )
    }
}

//Task5

@Composable
fun ValidationTask(){
    var text by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(100.dp)){
        TextField(
            value = text,
            onValueChange = {text = it}
        )
        if(text.isNotEmpty() && text.length < 3){
            Text(text = "Error, min 3 characters required!")
        }
    }
}

//Task6

@Composable
fun LightSwitch(){
    var isDarkMode by remember {mutableStateOf(false)}
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(100.dp)) {
        Switch(
            checked = isDarkMode,
            onCheckedChange = {isDarkMode = it}
        )
        Text(text = if(isDarkMode) "Dark" else "Light",
            modifier = Modifier.padding(start = 8.dp))
    }
}

//Task7

@Composable
fun SaveableTask() {

    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        modifier = Modifier.padding(100.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text("I have survived!") }
    )
}

//Task8

@Composable
fun ScrollButton(){
    val listState = rememberLazyListState()
    val showButton by remember{
        derivedStateOf{listState.firstVisibleItemIndex > 0}
    }

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(state = listState) {
            items(50) { index ->
                Text("Element: $index", modifier = Modifier.padding(16.dp))
            }
        }


        if (showButton) {
            Button(
                onClick = {},
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)
            ) {
                Text("Back to top of list")
            }

        }
    }
}

//Task9

@Composable
fun LaunchedEffectTask(){
    var isTextVisible by remember {mutableStateOf(true)}

    LaunchedEffect(key1 = Unit){
        delay(3000)
        isTextVisible = false
    }

    if(isTextVisible){
        Text(modifier = Modifier.padding(100.dp),
            text = "This message will dissapear in 3 seconds...")
    }

}






























