package com.example.shelfLib.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shelfLib.component.AppbarGeneral

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddBook() {
    Scaffold(
        topBar = {
            AppbarGeneral(title = "Add Book")
        }

    ){
        paddingValues -> paddingValues
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun P() {
    AddBook()
}