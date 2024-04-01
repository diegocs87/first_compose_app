package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_compose_app.R

@Composable
fun ProverbsCard() {
    val painterResource = painterResource(id = R.drawable.chelsea2)
    ElevatedCard() {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource, contentDescription = "Chelsea F.C logo")
            Column {
                Text(
                    "Chelsea F.C",
                    color = Color.Blue,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                )

                Text(
                    "Funded in: ",
                    color = Color.Black,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp)
                )
            }
        }
    }
}