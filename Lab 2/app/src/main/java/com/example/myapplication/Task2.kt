package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun PreviewFunctions() {
    Task2()
}

@Composable
fun Task2() {
    Row {
        Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_foreground
            ),
            contentDescription = "Description",
            Modifier.size(40.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Text(text = "1", modifier = Modifier.width(80.dp))
            Text(text = "2", modifier = Modifier.width(80.dp))
        }
    }
}
