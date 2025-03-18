package com.example.awakecoffee.Presentation.WelcomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.awakecoffee.R

@Composable
@Preview(showSystemUi = true)
fun WelcomeScreen() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().
        padding(10.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.coffee_beans),
            contentDescription = "Whatsapp Sticker",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Welcome to Awake Coffee",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.size(10.dp))
        Row {
            Text(
                text = "Read our",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.size(5.dp))

            Text(
                text = "Privacy Policy.",
                color = colorResource(id = R.color.light_coffee)
            )
            Text(
                text = "'Tap to Agree and Continue'",
                color = Color.Gray
            )
        }
        Row {
            Text(
                text = "Accept the",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.size(5.dp))

            Text(
                text = "Terms of Service.",
                color = colorResource(id = R.color.light_coffee)
            )
        }
        Spacer(modifier = Modifier.size(25.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.size(280.dp,43.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.dark_coffee)
            )
        ) {
            Text(text =  "Agree and Continue", fontSize = 16.sp)
        }
    }
}