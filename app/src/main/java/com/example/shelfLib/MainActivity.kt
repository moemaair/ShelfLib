package com.example.shelfLib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shelfLib.screens.HomeScreen
import com.example.shelfLib.ui.theme.ShelfwiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShelfwiseTheme {
                // A surface container using the 'background' color from the theme

                    HomeScreen()

            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ShelfwiseTheme {
//        Greeting("Android")
//    }
//}