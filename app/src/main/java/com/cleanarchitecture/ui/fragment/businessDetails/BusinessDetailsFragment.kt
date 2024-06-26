package com.cleanarchitecture.ui.fragment.businessDetails

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import com.cleanarchitecture.R
import com.cleanarchitecture.databinding.FragmentBusinessDetailsBinding
import com.digi.base_module.base.BaseFragment
import com.cleanarchitecture.ui.fragment.businessDetails.viewModel.BusinessDetailsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BusinessDetailsFragment : BaseFragment<FragmentBusinessDetailsBinding, BusinessDetailsViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_business_details

    override val viewModel: BusinessDetailsViewModel by viewModel()

    private val navArgs by navArgs<BusinessDetailsFragmentArgs>()

    override fun onReady(savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        if (navArgs.businessModel != null){
            binding.businessModel = navArgs.businessModel
        }
    }

    override fun onNetworkAvailable() {

    }

    override fun onNetworkLost() {

    }

}