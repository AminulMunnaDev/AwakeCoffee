package com.example.awakecoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.awakecoffee.Presentation.SplshScreen.Splashscreen
import com.example.awakecoffee.Presentation.userRegestration.UserRegistration
import com.example.awakecoffee.ui.theme.AwakeCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AwakeCoffeeTheme {
                UserRegistration()
            }
        }
    }
}


