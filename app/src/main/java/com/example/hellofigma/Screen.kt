package com.example.hellofigma

sealed class Screen(val route : String) {

    object FrontScreen : Screen("front")
    object LoginScreen : Screen("login")
    object StartScreen : Screen("start")
    object SignUpScreen: Screen("signup")
    object DonatinonScreen : Screen("donation")
    object ConfirmationScreen : Screen("confirmation")

    fun withArgs(vararg args : String): String{
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}