package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.first_compose_app.R

@Composable
fun OptionsTabsMenu() {
    TabRow(
        selectedTabIndex = 0,
        modifier = Modifier.background(Color.Magenta)
    ) {
        Tab(
            selected = false,
            onClick = { /* Lógica cuando se hace clic en la pestaña */ },

        ) {
            Icon(painter = painterResource(id = R.drawable.balance_icon), contentDescription = "Home Picture")
            Text("Tab 1")
        }
        Tab(
            selected = false,
            onClick = { /* Lógica cuando se hace clic en la pestaña */ }
        ) {
            Icon(painter = painterResource(id = R.drawable.bubble_icon), contentDescription = "Home Picture")
            Text("Tab 2")
        }
        // Otras pestañas...
    }
}