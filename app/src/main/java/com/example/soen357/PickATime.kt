package com.example.soen357

import android.os.Bundle
import android.text.style.BackgroundColorSpan
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "timePicker") {
        composable("timePicker") { TimePicker(navController) }
        composable("secondScreen") { GamePicker() }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            content()
        }
    }
}

@Composable
fun TimePicker(navController: NavController) {//E0E0E0
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
                        text = "Pick a time",
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(56.dp)) // Space between elements
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(300.dp, 150.dp)
                    .background(buttonColor, shape = RoundedCornerShape(10.dp))
            ) {
                Image(painter = painterResource(id = R.drawable.calendar),
                contentDescription = "calendar",
                modifier = Modifier.size(108.dp))
            }
            Spacer(modifier = Modifier.height(42.dp)) // Space between elements
            // Centered box with rectangle background
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .size(300.dp, 350.dp)
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
                        Text(text = "2:00 to 3:00 PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "2:00 to 3:00 PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "2:00 to 3:00 PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "2:00 to 3:00 PM")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(240.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = buttonColor,
                            contentColor = Color.White)

                    ) {
                        Text(text = "2:00 to 3:00 PM")
                    }
                }
            }
        }
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MyApp {
//        TimePicker()
//    }
//}
