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
        getCity()
    }

    private fun getCity() {
        scope.launch {
            val response = weatherInteractor.loadWeather("Hamburg").let {
                if(it.isSuccessful) {
                    Log.d("getting", it.body()?.location!!.name)
                } else {
                    Log.d("getting", "error suka")
                }
            }
        }
    }
}