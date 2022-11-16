package com.example.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.app.ui.event.NavEvent
import com.example.app.ui.screen.HomeScreen
import com.example.app.ui.screen.OtherScreen
import com.example.app.ui.screen.SplashScreen

@Composable
fun NavGraph(eventHandler: EventHandler, navController: NavHostController) {
    val startDestination = NavTarget.Splash.route

    NavHost(navController, startDestination) {
        composable(NavTarget.Splash.route) {
            SplashScreen {
                eventHandler.postNavEvent(
                    event = NavEvent.ActionWithPopUp(
                        target = NavTarget.Home,
                        popupTarget = NavTarget.Splash,
                        inclusive = true
                    )
                )
            }
        }

        composable(NavTarget.Home.route) {
            HomeScreen {
                eventHandler.postNavEvent(
                    event = NavEvent.Action(
                        target = NavTarget.Other
                    )
                )
            }
        }

        composable(NavTarget.Other.route) {
            OtherScreen(
                onClick = { }
            )
        }
    }
}