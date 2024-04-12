package com.example.first_compose_app.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_compose_app.presentation.composable_ui.model.Proverbs
import com.example.first_compose_app.presentation.composable_ui.screens.GetProverbsScreen
import com.example.first_compose_app.presentation.composable_ui.theme.First_compose_appTheme
import com.example.first_compose_app.presentation.data.ProverbsProvider

class MainActivity : ComponentActivity() {
    private val proverbsProvider = ProverbsProvider()
    private val proverbsList = proverbsProvider.retrieveProverbs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_compose_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProverbsCardsScreen(proverbsList)
                }
            }
        }
    }
}

@Composable
fun ProverbsCardsScreen(proverbsList:List<Proverbs>){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
    {
        GetProverbsScreen(proverbsList)
    }
}

@Preview(showBackground = true)
@Composable
fun ProverbsScreenPreview() {
    val proverbsProvider = ProverbsProvider()
    val proverbsList = proverbsProvider.retrieveProverbs()
    First_compose_appTheme {
        ProverbsCardsScreen(proverbsList)
    }
}