package com.gopal.profilex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.gopal.profilex.ui.ProfileScreen
import com.gopal.profilex.ui.theme.ProfileXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileXTheme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF0D0D0D))
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}