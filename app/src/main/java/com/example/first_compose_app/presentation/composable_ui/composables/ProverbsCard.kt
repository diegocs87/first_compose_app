package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

@Composable
fun ProverbsCard() {
    ElevatedCard() {
        Text(
            "hello card",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        )
    }
}