package com.so.revelation.glua.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColors = darkColorScheme(
    primary = Accent,
    onPrimary = Ink900,
    primaryContainer = AccentDim,
    onPrimaryContainer = Mist100,
    background = Ink900,
    onBackground = Mist100,
    surface = Ink800,
    onSurface = Mist100,
    surfaceVariant = Ink700,
    onSurfaceVariant = Mist300,
    outline = Ink500,
    error = LevelError,
)

private val LightColors = lightColorScheme(
    primary = AccentDim,
    onPrimary = Mist100,
    primaryContainer = Accent,
    onPrimaryContainer = Ink900,
    background = Mist100,
    onBackground = Ink900,
    surface = Mist100,
    onSurface = Ink900,
    surfaceVariant = Mist300,
    onSurfaceVariant = Ink600,
    outline = Mist500,
    error = LevelError,
)

@Composable
fun GluaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) DarkColors else LightColors
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window ?: return@SideEffect
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }
    MaterialTheme(colorScheme = colors, typography = GluaTypography, content = content)
}
