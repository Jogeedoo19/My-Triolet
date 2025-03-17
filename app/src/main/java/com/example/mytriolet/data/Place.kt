package com.example.mytriolet.data

data class Place(
    val id: String,
    val name: String,
    val category: PlaceCategory,
    val description: String,
    val address: String,
    val rating: Float,
    val imageUrl: String,
    val openingHours: String? = null,
    val contact: String? = null
)

enum class PlaceCategory {
    COFFEE_SHOP,
    RESTAURANT,
    KID_FRIENDLY,
    PARK,
    SHOPPING
}
