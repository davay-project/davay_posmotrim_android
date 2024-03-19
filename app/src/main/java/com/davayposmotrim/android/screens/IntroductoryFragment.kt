package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentIntroductoryBinding

class IntroductoryFragment :
    BaseFragment<FragmentIntroductoryBinding>(FragmentIntroductoryBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_introductoryFragment_to_registrationFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
