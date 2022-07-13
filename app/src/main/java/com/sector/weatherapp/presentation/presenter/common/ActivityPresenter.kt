package com.sector.weatherapp.presentation.presenter.common

import com.sector.weatherapp.presentation.view.activity.ActivityView
import moxy.InjectViewState
import javax.inject.Inject

@InjectViewState
class ActivityPresenter
@Inject
constructor(): BaseMvpPresenter<ActivityView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }

}