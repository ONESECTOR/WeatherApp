package com.sector.weatherapp.ui.root

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sector.weatherapp.R
import com.sector.weatherapp.databinding.FragmentRootBinding
import com.sector.weatherapp.extensions.addSystemTopPadding
import com.sector.weatherapp.presentation.presenter.root.RootPresenter
import com.sector.weatherapp.presentation.view.root.RootView
import com.sector.weatherapp.ui.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class RootFragment : BaseFragment<FragmentRootBinding>(), RootView {

    @Inject
    lateinit var presenterProvider: Provider<RootPresenter>

    private val presenter: RootPresenter by moxyPresenter { presenterProvider.get() }

    override fun onViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRootBinding = FragmentRootBinding.inflate(
        inflater,
        container,
        false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            root.addSystemTopPadding()
        }
    }
}