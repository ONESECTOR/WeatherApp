package com.sector.weatherapp.presentation.presenter.root

import com.sector.weatherapp.presentation.presenter.common.BaseMvpPresenter
import com.sector.weatherapp.presentation.view.root.RootView
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class RootPresenter @Inject constructor(

): BaseMvpPresenter<RootView>() {



}