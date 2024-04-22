package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.first_compose_app.R
import com.example.first_compose_app.presentation.composable_ui.model.Proverbs

private val elevatedCarModifier = Modifier
    .padding(start = 10.dp, end = 10.dp)
    .fillMaxWidth()

@Composable
fun ProverbsCard(proverb:Proverbs) {
    val customColor = Color.LightGray
    val cardColors = CardDefaults.cardColors(containerColor = customColor)
    ElevatedCard(modifier = elevatedCarModifier , colors = cardColors) {
        TeamInfoRow(proverb)
    }
}

@Composable
fun TeamInfoRow(proverb:Proverbs){
    Row(verticalAlignment = Alignment.CenterVertically) {
        TeamInfoImage(idResource = R.drawable.chelseafc)
        TeamInfoTextColumn(proverb)
    }
}

@Composable
fun TeamInfoImage(idResource:Int){
    val logoResource = painterResource(id = idResource)
    Image(painter = logoResource, contentDescription = "Chelsea F.C logo",
        Modifier
            .size(70.dp)
            .fillMaxSize()
            .fillMaxHeight())
}

@Composable
fun TeamInfoTextColumn(proverb:Proverbs){
    Column {
        TeamInfoText(text = "Src: " + proverb.src)
        TeamInfoText(text = "Proverb: " +proverb.proverb)
    }
}

@Composable
fun TeamInfoText(text:String){
    Text(
        text,
        color = Color.Black,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(start = 15.dp, end = 15.dp)
            .fillMaxSize()
    )
}

