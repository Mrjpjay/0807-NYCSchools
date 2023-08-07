package com.example.juanromero_nycschools_20230807.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tickets.view.DetailCompose
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dbn = intent.getStringExtra("dbn")
        setContent {
            DetailCompose(dbn)
        }
    }
}
