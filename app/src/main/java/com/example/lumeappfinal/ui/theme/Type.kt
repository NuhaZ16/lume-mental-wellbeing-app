package com.example.lumeappfinal.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.lumeappfinal.R

// Main font for UI
val Quicksand = FontFamily(
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_regular, FontWeight.Normal),
    Font(R.font.quicksand_medium, FontWeight.Medium),
    Font(R.font.quicksand_semi_bold, FontWeight.SemiBold),
    Font(R.font.quicksand_bold, FontWeight.Bold)
)

// Optional: Caveat for handwriting-style prompts
val Caveat = FontFamily(
    Font(R.font.caveat_regular, FontWeight.Normal),
    Font(R.font.caveat_medium, FontWeight.Medium),
    Font(R.font.caveat_semi_bold, FontWeight.SemiBold),
    Font(R.font.caveat_bold, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    )
)
