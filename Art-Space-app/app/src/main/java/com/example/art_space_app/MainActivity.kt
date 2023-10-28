package com.example.art_space_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art_space_app.ui.theme.Art_Space_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Art_Space_appTheme {
                ArtSpaceScreen()
            }
        }
    }
}

@Composable
fun ArtSpaceScreen() {

    var currentState by remember {
        mutableStateOf(1)
    }

    Surface(
        modifier = Modifier,
        color = MaterialTheme.colorScheme.background
    ) {
    }
}

@Composable
fun ArtWorkWall(
    resourceDrawable: Int,
    contentDescription: Int
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .border(
                BorderStroke(2.dp, Color.Gray)
            ),
        shadowElevation = 10.dp
    ) {
        Image(
            painter = painterResource(
                id = resourceDrawable
            ),
            contentDescription = stringResource(id = contentDescription),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(20.dp)
        )
    }
}

@Composable
fun ArtDescriptor(
    titleId: Int,
    nameID: Int,
    yearId: Int
) {
    Surface(
        shadowElevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(text = stringResource(id = titleId), fontSize = 18.sp)
            Row {
                Text(
                    text = stringResource(id = nameID),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = stringResource(id = yearId), fontSize = 16.sp)
            }
        }
    }
}

@Composable
fun DisplayController(
    onBackward: () -> Unit,
    onForward: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        Button(onClick = onBackward) {
            Text(
                text = stringResource(id = R.string.previous),
                textAlign = TextAlign.Center,
                modifier = Modifier.width(100.dp)
            )
        }
        Button(
            onClick = onForward
        ) {
            Text(
                text = stringResource(id = R.string.next),
                textAlign = TextAlign.Center,
                modifier = Modifier.width(100.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Art_Space_appTheme {
        ArtSpaceScreen()
    }
}