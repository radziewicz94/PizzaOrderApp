package com.example.pizzaorderapp.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaorderapp.R
import com.example.pizzaorderapp.ui.theme.Green800

@Composable
fun LoginPage(onStartClicked: () -> Unit) {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .background(color = Color.Black)
  ) {
    Image(
      painter = painterResource(id = R.drawable.start_screen_background),
      contentDescription = "Login Background",
      modifier = Modifier
        .fillMaxSize()
        .alpha(0.5f)
    )
    Column(
      modifier = Modifier.fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Bottom
    ) {
      Text(
        text = "Quatte Opasse",
        color = Color.White,
        fontSize = 48.sp,
        fontWeight = FontWeight.Bold
      )
      Text(
        text = "Włoska Pizzeria",
        color = Color.White,
        fontSize = 25.sp,
        modifier = Modifier.padding(bottom = 100.dp)
      )
      Button(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, end = 20.dp, bottom = 100.dp)
        .height(48.dp),
        shape = RoundedCornerShape(20),
        colors = ButtonDefaults.buttonColors(Green800),
        onClick = { onStartClicked() }) {
        Row(
          horizontalArrangement = Arrangement.Center,
          verticalAlignment = Alignment.CenterVertically
        ) {
          Text(text = "Zaloguj się", modifier = Modifier.padding(end = 10.dp))
          Image(
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = "icon arrow"
          )
        }
      }
    }
  }
}

@Preview
@Composable
fun LoginPagePreview() {
  LoginPage(onStartClicked = { })
}