package com.example.top

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.top.ui.theme.TopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CornerTextDisplay(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CornerTextDisplay(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = "left top",
            modifier = Modifier.align(Alignment.TopStart),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold) // Увеличение шрифта
        )
        Text(
            text = "right top",
            modifier = Modifier.align(Alignment.TopEnd),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "left bottom",
            modifier = Modifier.align(Alignment.BottomStart),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = "right bottom",
            modifier = Modifier.align(Alignment.BottomEnd),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun CornerTextDisplayPreview() {
    TopTheme {
        CornerTextDisplay()
    }
}
