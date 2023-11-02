package com.ahmedapps.create5starsratingbarinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ahmedapps.create5starsratingbarinjetpackcompose.ui.theme.Create5StarsRatingBarInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Create5StarsRatingBarInJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        var rating1 by remember {
                            mutableDoubleStateOf(3.5)
                        }
                        RatingBar(
                            modifier = Modifier
                                .size(50.dp),
                            rating = rating1,
                            onRatingChanged = {
                                rating1 = it
                            },
                            starsColor = Color.Green
                        )

                        Spacer(modifier = Modifier.height(30.dp))

                        var rating2 by remember {
                            mutableDoubleStateOf(2.5)
                        }
                        RatingBar(
                            modifier = Modifier
                                .size(50.dp),
                            rating = rating2,
                            onRatingChanged = {
                                rating2 = it
                            }
                        )


                        Spacer(modifier = Modifier.height(30.dp))


                        var rating3 by remember {
                            mutableDoubleStateOf(4.5)
                        }
                        RatingBar(
                            modifier = Modifier
                                .size(50.dp),
                            rating = rating3,
                            onRatingChanged = {
                                rating3 = it
                            },
                            stars = 7,
                            starsColor = MaterialTheme.colorScheme.primary
                        )

                    }

                }
            }
        }
    }
}

