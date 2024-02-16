package com.plcoding.composecustomshapes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.composecustomshapes.ui.theme.ComposeCustomShapesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCustomShapesTheme {

            }
        }
    }
}

@Preview
@Composable
fun SpeechBubblePreview() {
    ComposeCustomShapesTheme {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SpeechBubbleShape())
                .background(Color.Red)
        ) {
            Text(
                text = "Hello world!",
                modifier = Modifier
                    .offset(x = 15.dp)
            )
        }
    }
}