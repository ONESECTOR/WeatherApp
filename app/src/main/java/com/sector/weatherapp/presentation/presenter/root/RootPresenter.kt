package com.sector.weatherapp.presentation.presenter.root

import android.util.Log
import com.sector.weatherapp.model.interactor.WeatherInteractor
import com.sector.weatherapp.presentation.presenter.common.BaseMvpPresenter
import com.sector.weatherapp.presentation.view.root.RootView
import kotlinx.coroutines.launch
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class RootPresenter @Inject constructor(
    private val weatherInteractor: WeatherInteractor
): BaseMvpPresenter<RootView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        load()
    }

    private fun load() {
        scope.launch {
            val weather = weatherInteractor.loadWeather()
            Log.d("respoo", weather.toString())
        }
    }

}