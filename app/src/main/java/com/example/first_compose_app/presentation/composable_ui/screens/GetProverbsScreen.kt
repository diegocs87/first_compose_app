package com.example.first_compose_app.presentation.composable_ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsButton
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsCard

@Composable
fun GetProverbsScreen(){
    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)){
        items(10){
            ProverbsCard()
        }
    }
    ProverbsButton ()
}