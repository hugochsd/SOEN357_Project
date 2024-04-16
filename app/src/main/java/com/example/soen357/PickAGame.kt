package com.example.soen357

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun GamePicker() {//E0E0E0
    val buttonColor = Color(0xFF5271FF)
    val backgroundColor = Color(0xFFE0E0E0)

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { /* Handle back action */ },
                    modifier = Modifier.padding(start = 24.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = buttonColor,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Back")
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 84.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Pick a Game",
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(72.dp))// Space between elements
            // Centered box with rectangle background
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(320.dp, 550.dp)
                    .background(backgroundColor, shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 10 on 01/05/24 at 6:00PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 11 on 11/05/24 at 4:00PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 1 on 12/05/24 at 1:00PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 1 on 13/05/24 at 1:00PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 3 on 15/05/24 at 8:00PM")
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GamePickerPreview() {
    MyApp {
        GamePicker()
    }
}
