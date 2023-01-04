package com.example.hellofigma

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.hellofigma.frontpage.LoginButton

@Composable
fun FrontScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        LoginButton(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}