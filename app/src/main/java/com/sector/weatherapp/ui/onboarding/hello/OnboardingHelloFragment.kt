package com.sector.weatherapp.ui.onboarding.hello

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sector.weatherapp.R
import com.sector.weatherapp.databinding.FragmentOnboardingHelloBinding
import com.sector.weatherapp.extensions.addSystemTopPadding
import com.sector.weatherapp.extensions.navigateUp
import com.sector.weatherapp.presentation.presenter.onboarding.OnboardingHelloPresenter
import com.sector.weatherapp.presentation.view.onboarding.OnboardingHelloView
import com.sector.weatherapp.ui.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class OnboardingHelloFragment : BaseFragment<FragmentOnboardingHelloBinding>(), OnboardingHelloView {

    @Inject
    lateinit var presenterProvider: Provider<OnboardingHelloPresenter>

    private val presenter: OnboardingHelloPresenter by moxyPresenter { presenterProvider.get() }

    override fun onViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnboardingHelloBinding = FragmentOnboardingHelloBinding.inflate(
        inflater,
        container,
        false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            root.addSystemTopPadding()

            btnGetStarted.setOnClickListener {

            }
        }
    }
}