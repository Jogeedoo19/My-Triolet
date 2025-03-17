package com.example.mytriolet.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.mytriolet.data.PlaceCategory

import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.ShoppingCart

@Composable
fun CategoryCard(
    category: PlaceCategory,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = category.name.replace("_", " "),
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = getCategoryDescription(category),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Icon(
                imageVector = getCategoryIcon(category),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

private fun getCategoryDescription(category: PlaceCategory): String {
    return when (category) {
        PlaceCategory.COFFEE_SHOP -> "Discover cozy cafes and coffee spots"
        PlaceCategory.RESTAURANT -> "Explore local and international cuisine"
        PlaceCategory.KID_FRIENDLY -> "Fun places for the whole family"
        PlaceCategory.PARK -> "Relax in nature and outdoor spaces"
        PlaceCategory.SHOPPING -> "Shop at markets and retail centers"
    }
}

private fun getCategoryIcon(category: PlaceCategory): ImageVector {
    return when (category) {
        PlaceCategory.COFFEE_SHOP -> Icons.Default.Coffee
        PlaceCategory.RESTAURANT -> Icons.Default.Restaurant
        PlaceCategory.KID_FRIENDLY -> Icons.Default.ChildCare
        PlaceCategory.PARK -> Icons.Default.Park
        PlaceCategory.SHOPPING -> Icons.Default.ShoppingCart
    }
}