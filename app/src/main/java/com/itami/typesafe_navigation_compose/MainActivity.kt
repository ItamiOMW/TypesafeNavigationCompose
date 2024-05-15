package com.itami.typesafe_navigation_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.itami.typesafe_navigation_compose.ui.theme.TypesafeNavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TypesafeNavigationComposeTheme {

            }
        }
    }
}