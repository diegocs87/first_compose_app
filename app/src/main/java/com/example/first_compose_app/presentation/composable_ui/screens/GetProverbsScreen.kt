package com.example.first_compose_app.presentation.composable_ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsButton
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsCard
import com.example.first_compose_app.presentation.composable_ui.composables.optionsTabsMenu
import com.example.first_compose_app.presentation.composable_ui.model.Proverbs

@Composable
fun GetProverbsScreen(proverbsList:List<Proverbs>){
    optionsTabsMenu()
    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(top = 10.dp)){
        proverbsList.forEach { currentProverb -> item { ProverbsCard(currentProverb) } }
    }
    ProverbsButton ()
}