package com.ahmet.bostanciklioglu.androidsimplelistsjetpackcompose.presentations

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.bostanciklioglu.androidsimplelistsjetpackcompose.R
import com.ahmet.bostanciklioglu.androidsimplelistsjetpackcompose.ui.theme.AndroidSimpleListsJetpackComposeTheme

@Composable
fun LazyColumnLists(modifier: Modifier = Modifier) {
    val listItems = stringArrayResource(id = R.array.currencyunit)
    LazyColumn {
        itemsIndexed(
            listOf("This", "is", "Android", "Simple", "Lists", "Jetpack", "Compose")
        ) { index, item ->
            Text(
                text = item,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            )
        }
        items(listItems) { listItem ->
            Text(
                text = listItem,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}

@Preview
@Composable
fun LazyColumnListsPreview() {
    AndroidSimpleListsJetpackComposeTheme {
        LazyColumnLists()
    }
}