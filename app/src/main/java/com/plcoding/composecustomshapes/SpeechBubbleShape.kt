package com.plcoding.composecustomshapes

import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class SpeechBubbleShape(
    private val cornerRadius: Dp = 15.dp,
    private val tipSize: Dp = 15.dp
): Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val tipSize = with(density) { tipSize.toPx() }
        val cornerRadius = with(density) { cornerRadius.toPx() }
        val path = Path().apply {
            addRoundRect(
                RoundRect(
                    left = tipSize,
                    top = 0f,
                    right = size.width,
                    bottom = size.height - tipSize,
                    radiusX = cornerRadius,
                    radiusY = cornerRadius
                )
            )

            moveTo(
                x = tipSize,
                y = size.height - tipSize - cornerRadius
            )

            lineTo(
                x = 0f,
                y = size.height
            )

            lineTo(
                x = tipSize + cornerRadius,
                y = size.height - tipSize
            )

            close()
        }

        return Outline.Generic(path)
    }
}