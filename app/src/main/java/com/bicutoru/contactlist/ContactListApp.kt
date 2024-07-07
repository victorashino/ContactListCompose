package com.bicutoru.contactlist

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactListApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "contactList") {
        composable(route = "contactList") {
            ContactListScreen()
        }
    }
}