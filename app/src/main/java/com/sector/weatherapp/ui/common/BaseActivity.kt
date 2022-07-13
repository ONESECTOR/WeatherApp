package com.sector.weatherapp.ui.common

import androidx.annotation.LayoutRes
import com.sector.weatherapp.presentation.view.common.BaseMvpView
import moxy.MvpAppCompatActivity

open class BaseActivity(@LayoutRes layoutResId: Int):
    MvpAppCompatActivity(layoutResId), BaseMvpView {

}