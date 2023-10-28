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
        when (currentState) {
            1 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art3,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_1_title,
                        nameID = R.string.artist_1_name,
                        yearId = R.string.art_work_1_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 6 },
                        onForward = { currentState = 2 }
                    )
                }
            }

            2 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art5,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_2_title,
                        nameID = R.string.artist_2_name,
                        yearId = R.string.art_work_2_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 1 },
                        onForward = { currentState = 3 })
                }
            }

            3 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art6,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_3_title,
                        nameID = R.string.artist_3_name,
                        yearId = R.string.art_work_3_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 2 },
                        onForward = { currentState = 4 })
                }
            }
            4 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art2,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_4_title,
                        nameID = R.string.artist_4_name,
                        yearId = R.string.art_work_4_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 3 },
                        onForward = { currentState = 5 })
                }
            }
            5 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art4,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_5_title,
                        nameID = R.string.artist_5_name,
                        yearId = R.string.art_work_5_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 4 },
                        onForward = { currentState = 6 })
                }
            }
            6 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art7,
                        contentDescription = R.string.art_work_content_desc
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        titleId = R.string.art_work_7_title,
                        nameID = R.string.artist_7_name,
                        yearId = R.string.art_work_7_year
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 5 },
                        onForward = { currentState = 1 })
                }
            }
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