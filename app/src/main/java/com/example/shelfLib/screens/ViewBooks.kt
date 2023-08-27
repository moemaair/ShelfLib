package com.example.shelfLib.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.shelfLib.component.AppbarGeneral

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewBook() {
    Scaffold(
        topBar = {
            AppbarGeneral(title = "Library")
        }

    ){
            paddingValues -> paddingValues
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun P3() {
    ViewBook()
}