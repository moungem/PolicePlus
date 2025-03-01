package com.example.policeplus.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun NotesScreen(modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center,modifier=Modifier.fillMaxSize()){
        Text(text = "Notes Screen", fontWeight = FontWeight.Bold, fontSize = 42.sp)
    }
}