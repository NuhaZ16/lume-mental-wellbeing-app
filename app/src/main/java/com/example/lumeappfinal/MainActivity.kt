package com.example.lumeappfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lumeappfinal.ui.HomeScreen
import com.example.lumeappfinal.ui.MoodScreen
import com.example.lumeappfinal.ui.theme.LumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LumeTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AppNav()
                }
            }
        }
    }
}

@Composable
fun AppNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onNavigateToMood = { navController.navigate("mood") })
        }
        composable("mood") {
            MoodScreen(onBack = { navController.popBackStack() })
        }
    }
}
