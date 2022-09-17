package com.sector.weatherapp.extensions

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController

fun Fragment.navigateUp() = findNavController().navigateUp()

fun Fragment.navigate(destination: NavDirections) = with(findNavController()) {
    currentDestination?.getAction(destination.actionId)?.let {
        navigate(destination)
    }
}

fun Fragment.navigate(
    destination: NavDirections,
    navigatorExtras: Navigator.Extras
) = with(findNavController()) {
    currentDestination?.getAction(destination.actionId)?.let {
        navigate(destination, navigatorExtras)
    }
}