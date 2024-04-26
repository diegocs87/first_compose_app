package com.example.first_compose_app.presentation.composable_ui.composables

import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.first_compose_app.R

@Composable
fun OptionsTabsMenu() {
    val tabsTittleList = listOf ("Home Picture","Scale picture")
    var selectedTabIndex by remember { mutableStateOf(0) }
    TabRow(selectedTabIndex = selectedTabIndex , containerColor = Color.LightGray) {
        tabsTittleList.forEachIndexed { tabIndex, tittle ->
            Tab(selected = isSelected(tabIndex,selectedTabIndex) , onClick = { selectedTabIndex = tabIndex }) {
                Icon(painter = painterResource(getResourceOfTab(tabIndex)), contentDescription = tittle)
                Text(tittle)
            }
        }
    }
}

private fun isSelected(tabIndex:Int, selectedTabIndex: Int) = tabIndex == selectedTabIndex

private fun getResourceOfTab(id:Int): Int {
    return when(id){
        0 -> R.drawable.balance_icon
        1 -> R.drawable.bubble_icon
        else -> R.drawable.balance_icon
    }
}