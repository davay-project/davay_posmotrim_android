package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R

const val ONE_SEC = 1000L

class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_introductoryFragment)
        }, ONE_SEC)
    }
}
