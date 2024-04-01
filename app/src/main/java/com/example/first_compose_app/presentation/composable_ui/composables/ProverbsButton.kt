package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

@Composable
//fun proverbsButton(onClick: () ->Unit){
fun ProverbsButton(){
    ElevatedButton(onClick = {},
        colors = ButtonDefaults.buttonColors(
        contentColor = Color.Black)) {
            Text("Get Proverbs",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif)
    }
}