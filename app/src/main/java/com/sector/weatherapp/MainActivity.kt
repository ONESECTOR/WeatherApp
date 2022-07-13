package com.sector.weatherapp

import com.sector.weatherapp.presentation.presenter.common.ActivityPresenter
import com.sector.weatherapp.presentation.view.activity.ActivityView
import com.sector.weatherapp.ui.common.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.activity_main), ActivityView {

    @Inject
    lateinit var presenterProvider: Provider<ActivityPresenter>

    private val presenter: ActivityPresenter by moxyPresenter { presenterProvider.get() }
}