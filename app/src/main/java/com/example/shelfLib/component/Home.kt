package com.example.shelfLib.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shelfLib.ui.theme.robotoFontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(217.dp)
            .background(Color(0XFF263585)),
            contentAlignment = androidx.compose.ui.Alignment.Center)
        {

            Text(text = "ShelfLib",

                style = TextStyle(
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            )

        }

        Spacer(modifier = Modifier.height(50.dp)) // Adding vertical space
        // search textfield

        SearchTextField(modifier = Modifier.background(Color.Transparent))

        Spacer(modifier = Modifier.height(100.dp)) // Adding vertical space

        Column (modifier= Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

                Text(text = "Check if Book is in Library",
                    style = TextStyle(
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF258BFF)
                )
                )
                Text(text = "Add Book to Library",
                    style = TextStyle(
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                        color = Color(0xFF258BFF)
                )
                )
                Text(text = "View Library" ,
                    style = TextStyle(
                    fontFamily = robotoFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                        color = Color(0xFF258BFF)
                )
                )

        }
    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenP() {
    HomeScreen(modifier = Modifier.fillMaxSize())
}