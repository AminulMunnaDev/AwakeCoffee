package com.example.awakecoffee.Presentation.userRegestration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.awakecoffee.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistration() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white)),
        contentAlignment = Alignment.Center
    ) {

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.white))
        ) {

            Text(
                text = "User Registration",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.dark_coffee),
                modifier = Modifier.padding(top = 200.dp)
            )
            Spacer(modifier = Modifier.size(60.dp))
            OutlinedTextField(
                value = email,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                onValueChange = {
                    email = it
                },
                label = { Text(text = "Enter your Email") },
                singleLine = true,
                textStyle = TextStyle(color = Color.Black),  // ✅ Force text color
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,  // Transparent background when focused
                    unfocusedContainerColor = Color.Transparent, // Transparent when not focused
                    focusedIndicatorColor = Color.Black,       // ✅ Border color when focused
                    unfocusedIndicatorColor = Color.Black,     // ✅ Border color when not focused
                    focusedLabelColor = Color.Black,          // ✅ Label color when typing (focused)
                    unfocusedLabelColor = Color.Black,          // ✅ Label color when not typing (unfocused)
                    cursorColor = Color.Black,                 // ✅ Cursor color
                    focusedTextColor = Color.Black,           // ✅ Input text color when focused
                    unfocusedTextColor = Color.Black       // ✅ Input text color when unfocused
                )
            )
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                value = name,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                onValueChange = {
                    name = it
                },
                label = { Text(text = "Enter your name") },
                singleLine = true,
                textStyle = TextStyle(color = Color.Black),  // ✅ Force text color
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,  // Transparent background when focused
                    unfocusedContainerColor = Color.Transparent, // Transparent when not focused
                    focusedIndicatorColor = Color.Black,       // ✅ Border color when focused
                    unfocusedIndicatorColor = Color.Black,     // ✅ Border color when not focused
                    focusedLabelColor = Color.Black,          // ✅ Label color when typing (focused)
                    unfocusedLabelColor = Color.Black,          // ✅ Label color when not typing (unfocused)
                    cursorColor = Color.Black,                 // ✅ Cursor color
                    focusedTextColor = Color.Black,           // ✅ Input text color when focused
                    unfocusedTextColor = Color.Black       // ✅ Input text color when unfocused
                )
            )
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                value = phone,
                onValueChange = { newValue ->
                    phone = newValue.filter { it.isDigit() }
                },
                label = { Text(text = "Phone number") },
                singleLine = true,
                textStyle = TextStyle(color = Color.Black),  // ✅ Force text color
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,  // Transparent background when focused
                    unfocusedContainerColor = Color.Transparent, // Transparent when not focused
                    focusedIndicatorColor = Color.Black,       // ✅ Border color when focused
                    unfocusedIndicatorColor = Color.Black,     // ✅ Border color when not focused
                    focusedLabelColor = Color.Black,          // ✅ Label color when typing (focused)
                    unfocusedLabelColor = Color.Black,          // ✅ Label color when not typing (unfocused)
                    cursorColor = Color.Black,                 // ✅ Cursor color
                    focusedTextColor = Color.Black,           // ✅ Input text color when focused
                    unfocusedTextColor = Color.Black       // ✅ Input text color when unfocused
                )
            )
            Spacer(modifier = Modifier.size(20.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.dark_coffee), // Background color
                    contentColor = Color.White   // Text color
                )
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 16.sp
                )
            }
        }
        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "From",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Spacer(modifier = Modifier.padding(horizontal = 1.dp))
                Text(
                    text = "Awake Coffee",
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.dark_coffee),
                    fontSize = 23.sp
                )
            }
        }
    }
}