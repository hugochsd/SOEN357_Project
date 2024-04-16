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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MyGames(navController: NavController) {//E0E0E0
    val buttonColor = Color(0xFF5271FF)
    val backgroundColor = Color(0xFFE0E0E0)
    val context = LocalContext.current

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
                    onClick = {  if (context is ComponentActivity) {
                        context.finish()
                    } },
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
                        text = "My Games",
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(102.dp))// Space between elements
            // Centered box with rectangle background
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(320.dp, 420.dp)
                    .background(backgroundColor, shape = RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Row() {
                        Button(
                            onClick = { navController.navigate("gameInformation")  },
                            modifier = Modifier.width(140.dp).height(58.dp),
                            shape = RoundedCornerShape(24.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = buttonColor,
                                contentColor = Color.White)

                        ) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = Modifier.width(16.dp))// Space between elements
                        Button(
                            onClick = { navController.navigate("gameInformation")},
                            modifier = Modifier.width(140.dp).height(58.dp),
                            shape = RoundedCornerShape(24.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = buttonColor,
                                contentColor = Color.White)

                        ) {
                            Text(text = "Upcoming ")

                        }
                    }

                    Button(
                        onClick = {navController.navigate("gameInformation") },
                        modifier = Modifier.width(270.dp).height(48.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 1")
                    }
                    Button(
                        onClick = { navController.navigate("gameInformation")},
                        modifier = Modifier.width(270.dp).height(48.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "Jeanne-Mance Court 2")
                    }
                }
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun MyGamesPreview() {
//    MyApp {
//        MyGames()
//    }
//}
