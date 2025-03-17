package com.example.mytriolet.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mytriolet.data.Place
import com.example.mytriolet.data.PlaceCategory
import com.example.mytriolet.data.PlacesData
import com.example.mytriolet.ui.components.PlaceCard

@Composable
fun CategoryScreen(
    category: PlaceCategory,
    onPlaceClick: (Place) -> Unit
) {
    val places = PlacesData.getPlacesByCategory(category)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = category.name.replace("_", " "),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(places) { place ->
                PlaceCard(
                    place = place,
                    onClick = { onPlaceClick(place) }
                )
            }
        }
    }
}
@Composable
fun PlaceCard(
    place: Place,
    onClick: () -> Unit
) {

}