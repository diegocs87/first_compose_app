package com.example.first_compose_app.presentation.composable_ui.screens

import androidx.compose.runtime.Composable
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsButton
import com.example.first_compose_app.presentation.composable_ui.composables.ProverbsCard

@Composable
fun GetProverbsScreen(){
    ProverbsCard()
    ProverbsButton ()
}