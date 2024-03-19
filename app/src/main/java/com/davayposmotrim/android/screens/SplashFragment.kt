package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_introductoryFragment)
        }, 1000)
        super.onViewCreated(view, savedInstanceState)
    }
}
