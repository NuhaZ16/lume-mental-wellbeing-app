package com.example.lumeappfinal.ui

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoodScreen(onBack: () -> Unit) {
    val ctx = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(text = "How are you today?", fontSize = 22.sp, color = Tyrian)
        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            MoodFlower("🌻", "Happy") { Toast.makeText(ctx, "Saved Happy", Toast.LENGTH_SHORT).show(); onBack() }
            MoodFlower("💜", "Calm") { Toast.makeText(ctx, "Saved Calm", Toast.LENGTH_SHORT).show(); onBack() }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            MoodFlower("🌸", "Sad") { Toast.makeText(ctx, "Saved Sad", Toast.LENGTH_SHORT).show(); onBack() }
            MoodFlower("🌹", "Anxious") { Toast.makeText(ctx, "Saved Anxious", Toast.LENGTH_SHORT).show(); onBack() }
        }
    }
}

@Composable
fun MoodFlower(emoji: String, label: String, onClick: () -> Unit) {
    Card(modifier = Modifier
        .weight(1f)
        .height(110.dp)
        .fillMaxSize()
        .padding(0.dp),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = emoji, fontSize = 34.sp)
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = label, fontSize = 14.sp)
            }
        }
    }
}
