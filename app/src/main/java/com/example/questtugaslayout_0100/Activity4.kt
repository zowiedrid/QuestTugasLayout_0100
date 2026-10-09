package com.example.questtugaslayout_0100

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.questtugaslayout_0100.ui.theme.QuestTugasLayout_0100Theme


@Composable
fun ActivityKeempat(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) { }
}



@Preview(showBackground = true)
@Composable
fun ActivityKeempat2Preview() {
    QuestTugasLayout_0100Theme()  { }Theme {
        ActivityKeempat()
    }
}