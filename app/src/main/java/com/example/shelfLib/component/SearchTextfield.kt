package com.example.shelfLib.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.TextUnit
import com.example.shelfLib.ui.theme.robotoFontFamily
import java.time.format.TextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextField(modifier: Modifier) {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .wrapContentSize()
            .background(Color.Transparent)
            .padding(16.dp)
    ) {
        TextField(
            value = textState,
            onValueChange = { newValue -> textState = newValue },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.Transparent),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(text = "Search for a book in your library",
                    modifier = Modifier.padding(3.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        fontFamily = robotoFontFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 13.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black
                    )
                )
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription ="" ,
                    modifier = Modifier.clickable {
                        println("are you searching!!")
                    }
                )
            }


        )
    }
}

//@Preview
//@Composable
//fun TextFieldPreview() {
//    TextFieldExample()
//}

