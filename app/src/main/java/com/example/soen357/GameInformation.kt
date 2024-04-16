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
fun GameInformation() {//E0E0E0
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
                        text = "Game Information",
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(52.dp))
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(320.dp, 200.dp)
                    .background(backgroundColor, shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 12.dp),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.Start

                ) {
                    Text(text = "Location: Jeanne-Mance Park")
                    Text(text = "Time: 5:00 to 6:00 PM")
                    Text(text = "Court Number: 12")
                    Text(text = "Players: 4")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row {
                Text(text = "Competitive match status:")
                Spacer(modifier = Modifier.width(22.dp))

                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .size(150.dp, 30.dp)
                        .background(buttonColor, shape = RoundedCornerShape(0.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.Start

                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = "Active", color = Color.White)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start ) {
                Text(text = "Score:")
                Spacer(modifier = Modifier.width(22.dp))
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier
                        .size(150.dp, 30.dp)
                        .background(buttonColor, shape = RoundedCornerShape(0.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.Start

                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(text = "Add Score", color = Color.White)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
            Text(text = "Team 1", modifier = Modifier.padding(end = 15.dp))
            Column {
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.jon),
                            contentDescription = "player 1",
                            modifier = Modifier.size(108.dp)
                        )
                        Text(text = "John Snow")
                    }
                    Spacer(modifier = Modifier.width(72.dp))
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.jamie),
                            contentDescription = "player 2",
                            modifier = Modifier.size(108.dp)
                        )
                        Text(text = "Jaime Lannister")

                    }

                }
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "Team 2", modifier = Modifier.padding(start = 120.dp))
                Row() {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.ned),
                            contentDescription = "player 1",
                            modifier = Modifier.size(108.dp)
                        )
                        Text(text = "Ned Stark")
                    }
                    Spacer(modifier = Modifier.width(72.dp))
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.bran),
                            contentDescription = "player 2",
                            modifier = Modifier.size(108.dp)
                        )
                        Text(text = "Bran Stark")

                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GameInformationPreview() {
    MyApp {
        GameInformation()
    }
}
