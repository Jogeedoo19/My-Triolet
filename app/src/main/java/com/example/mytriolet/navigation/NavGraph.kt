package com.example.mytriolet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mytriolet.data.PlaceCategory
import com.example.mytriolet.data.PlacesData
import com.example.mytriolet.ui.screens.CategoryScreen
import com.example.mytriolet.ui.screens.DetailScreen
import com.example.mytriolet.ui.screens.HomeScreen
import androidx.navigation.compose.composable


sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category/{categoryName}") {
        fun createRoute(categoryName: String) = "category/$categoryName"
    }
    object Detail : Screen("detail/{placeId}") {
        fun createRoute(placeId: String) = "detail/$placeId"
    }
}

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onCategoryClick = { category ->
                    navController.navigate(
                        Screen.Category.createRoute(category.name)
                    )
                }
            )
        }

        composable(
            route = Screen.Category.route,
            arguments = listOf(
                navArgument("categoryName") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName")
            val category = PlaceCategory.valueOf(categoryName ?: PlaceCategory.RESTAURANT.name)

            CategoryScreen(
                category = category,
                onPlaceClick = { place ->
                    navController.navigate(
                        Screen.Detail.createRoute(place.id)
                    )
                }
            )
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument("placeId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId")
            val place = PlacesData.places.find { it.id == placeId }
                ?: PlacesData.places.first()

            DetailScreen(
                place = place,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}