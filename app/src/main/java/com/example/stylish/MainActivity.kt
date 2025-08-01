package com.example.stylish

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.stylish.presentation.AppSplashScreen
import com.example.stylish.ui.theme.StylishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StylishTheme {
                AppSplashScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}
