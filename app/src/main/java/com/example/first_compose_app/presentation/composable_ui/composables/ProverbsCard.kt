package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
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

private val elevatedCarModifier = Modifier.padding(start = 10.dp, end = 10.dp).fillMaxWidth()

@Composable
fun ProverbsCard() {
    val customColor = Color(0xFF27B7BB)
    val cardColors = CardDefaults.cardColors(containerColor = customColor)
    val painterResource = painterResource(id = R.drawable.chelsea2)
    ElevatedCard(modifier = elevatedCarModifier , colors = cardColors) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource, contentDescription = "Chelsea F.C logo",
                Modifier
                    .size(70.dp)
                    .fillMaxSize())
            Column {
                Text(
                    "Chelsea F.C",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp)
                        .fillMaxSize()
                )

                Text(
                    "Funded in: ",
                    color = Color.Black,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp)
                        .fillMaxSize()
                )
            }
        }
    }
}