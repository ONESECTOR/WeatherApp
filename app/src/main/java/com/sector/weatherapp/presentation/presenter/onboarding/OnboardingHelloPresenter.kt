package com.sector.weatherapp.presentation.presenter.onboarding

import com.sector.weatherapp.model.interactor.WeatherInteractor
import com.sector.weatherapp.presentation.presenter.common.BaseMvpPresenter
import com.sector.weatherapp.presentation.view.onboarding.OnboardingHelloView
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class OnboardingHelloPresenter @Inject constructor(
    private val weatherInteractor: WeatherInteractor
): BaseMvpPresenter<OnboardingHelloView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }
}