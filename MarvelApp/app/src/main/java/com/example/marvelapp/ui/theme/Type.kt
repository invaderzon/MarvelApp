package com.example.marvelbaseproject.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.marvelbaseproject.R

val banger = FontFamily(
    Font(R.font.bangers, FontWeight.Normal)
)


val akshar = FontFamily(
    Font(R.font.akshar_regular, FontWeight.Normal),
    Font(R.font.akshar_medium, FontWeight.Medium),
    Font(R.font.akshar_semibold, FontWeight.SemiBold),
    Font(R.font.akshar_bold,FontWeight.Bold),
    Font(R.font.akshar_light,FontWeight.Light)
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = akshar,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = akshar,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = banger,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        lineHeight = 35.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = banger,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    )
/* Other default text styles to override,
labelSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 11.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5.sp
)
*/
)