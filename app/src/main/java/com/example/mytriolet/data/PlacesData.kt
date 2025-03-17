package com.example.mytriolet.data

import com.example.mytriolet.R

object PlacesData {
    val places = listOf(
        // Coffee Shops
        Place(
            id = "c1",
            name = "Le Café Triolet",
            category = PlaceCategory.COFFEE_SHOP,
            description = "Cozy café serving local coffee and pastries",
            address = "Royal Road, Triolet",
            rating = 4.5f,
            imageUrl = R.drawable.le_cafe_triolet.toString(),
            openingHours = "7:00 AM - 7:00 PM"
        ),
        Place(
            id = "c2",
            name = "Morning Brew",
            category = PlaceCategory.COFFEE_SHOP,
            description = "Modern coffee shop with specialty drinks",
            address = "Church Street, Triolet",
            rating = 4.3f,
            imageUrl = R.drawable.morning_brew.toString()
        ),
        Place(
            id = "c3",
            name = "Mo Cafe",
            category = PlaceCategory.COFFEE_SHOP,
            description = "We have a large variety of pastries",
            address = "Royal road, Triolet",
            rating = 4.3f,
            imageUrl = R.drawable.mocafe.toString()
        ),
        Place(
            id = "c4",
            name = "J's Patisserie et Cafe",
            category = PlaceCategory.COFFEE_SHOP,
            description = "Place your order now",
            address = "Temple Road, Triolet",
            rating = 4.5f,
            imageUrl = R.drawable.jscafe.toString()
        ),
        Place(
            id = "c5",
            name = "Earth Cafe",
            category = PlaceCategory.COFFEE_SHOP,
            description = "Great alternative cafe for a relaxed breakfast",
            address = "Trou aux Biches road, Triolet",
            rating = 4.3f,
            imageUrl = R.drawable.earthcafe.toString()
        ),

        // Restaurants
        Place(
            id = "r1",
            name = "Chez Mario Restaurant",
            category = PlaceCategory.RESTAURANT,
            description = "Authentic Mauritian cuisine",
            address = "Main Road, Triolet",
            rating = 4.7f,
            imageUrl = R.drawable.chez_mario.toString()
        ),
        Place(
            id = "r2",
            name = "Triolet Delight",
            category = PlaceCategory.RESTAURANT,
            description = "Chinese and Creole fusion restaurant",
            address = "Temple Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.triolet_delight.toString()
        ),
        Place(
            id = "r3",
            name = "Sameer Snack",
            category = PlaceCategory.RESTAURANT,
            description = "Enjoy delicious briani that's perfect for any occasion",
            address = "Temple Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.sameersnack.toString()
        ),
        Place(
            id = "r4",
            name = "Tariq Snack",
            category = PlaceCategory.RESTAURANT,
            description = "Discover the best of mauritian street food",
            address = "Temple Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.tariqsnack.toString()
        ),
        Place(
            id = "r5",
            name = "Wok n Grill",
            category = PlaceCategory.RESTAURANT,
            description = "Enjoy the best chinese fusion and grilled BBQ",
            address = "Temple Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.wokngrill.toString()
        ),

        // Kid-Friendly Places
        Place(
            id = "k1",
            name = "Fun Zone Triolet",
            category = PlaceCategory.KID_FRIENDLY,
            description = "Indoor playground and activity center",
            address = "School Lane, Triolet",
            rating = 4.6f,
            imageUrl = R.drawable.fun_zone.toString()
        ),
        Place(
            id = "k2",
            name = "Ice Cream Paradise",
            category = PlaceCategory.KID_FRIENDLY,
            description = "Ice cream parlor with kids' play area",
            address = "Market Street, Triolet",
            rating = 4.8f,
            imageUrl = R.drawable.ice_cream_paradise.toString()
        ),
        Place(
            id = "k3",
            name = "Happy Jump Park",
            category = PlaceCategory.KID_FRIENDLY,
            description = "Trampoline park with obstacle courses and slides",
            address = "Main Road, Triolet",
            rating = 4.7f,
            imageUrl = R.drawable.happy_jump_park.toString()
        ),
        Place(
            id = "k4",
            name = "Little Explorers Museum",
            category = PlaceCategory.KID_FRIENDLY,
            description = "Interactive museum designed for kids with hands-on exhibits",
            address = "Heritage Street, Triolet",
            rating = 4.5f,
            imageUrl = R.drawable.little_explorers_museum.toString()
        ),
        Place(
            id = "k5",
            name = "Dino World Playland",
            category = PlaceCategory.KID_FRIENDLY,
            description = "Dinosaur-themed indoor play area with climbing walls and tunnels",
            address = "Adventure Avenue, Triolet",
            rating = 4.9f,
            imageUrl = R.drawable.dino_world_playland.toString()
        ),


                // Parks
        Place(
            id = "p1",
            name = "Triolet Central Park",
            category = PlaceCategory.PARK,
            description = "Large park with walking trails",
            address = "Park Road, Triolet",
            rating = 4.5f,
            imageUrl = R.drawable.central_park.toString()
        ),
        Place(
            id = "p2",
            name = "Garden of Peace",
            category = PlaceCategory.PARK,
            description = "Quiet garden with meditation areas",
            address = "Temple Road, Triolet",
            rating = 4.2f,
            imageUrl = R.drawable.peace_garden.toString()
        ),
        Place(
            id = "p3",
            name = "Riverside Nature Park",
            category = PlaceCategory.PARK,
            description = "Scenic park by the river with picnic spots and birdwatching",
            address = "Riverside Lane, Triolet",
            rating = 4.6f,
            imageUrl = R.drawable.riverside_nature_park.toString()
        ),
        Place(
            id = "p4",
            name = "Sunset View Park",
            category = PlaceCategory.PARK,
            description = "Beautiful park with a lake and perfect sunset views",
            address = "Lake Drive, Triolet",
            rating = 4.7f,
            imageUrl = R.drawable.sunset_view_park.toString()
        ),
        Place(
            id = "p5",
            name = "Adventure Green",
            category = PlaceCategory.PARK,
            description = "Open green space with jogging trails and a kids' play zone",
            address = "Greenfield Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.adventure_green.toString()
        ),


                // Shopping
        Place(
            id = "s1",
            name = "Triolet Mall",
            category = PlaceCategory.SHOPPING,
            description = "Modern shopping center with various stores",
            address = "Main Road, Triolet",
            rating = 4.4f,
            imageUrl = R.drawable.triolet_mall.toString()
        ),
        Place(
            id = "s2",
            name = "Local Market",
            category = PlaceCategory.SHOPPING,
            description = "Traditional market with local products",
            address = "Market Street, Triolet",
            rating = 4.6f,
            imageUrl = R.drawable.local_market.toString()
        ),
        Place(
            id = "s3",
            name = "Fashion Hub",
            category = PlaceCategory.SHOPPING,
            description = "Trendy boutique with the latest fashion collections",
            address = "Style Avenue, Triolet",
            rating = 4.3f,
            imageUrl = R.drawable.fashion_hub.toString()
        ),

        Place(
            id = "s4",
            name = "Tech World",
            category = PlaceCategory.SHOPPING,
            description = "Electronics store with the latest gadgets and accessories",
            address = "Tech Street, Triolet",
            rating = 4.5f,
            imageUrl = R.drawable.tech_world.toString()
        ),
        Place(
            id = "s5",
            name = "Home Essentials",
            category = PlaceCategory.SHOPPING,
            description = "Department store for home and kitchen essentials",
            address = "Comfort Lane, Triolet",
            rating = 4.2f,
            imageUrl = R.drawable.home_essentials.toString()
        )

    )

    fun getPlacesByCategory(category: PlaceCategory): List<Place> {
        return places.filter { it.category == category }
    }
}
