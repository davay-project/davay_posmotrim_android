package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToEditName.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_editNameFragment)
        }
        binding.buttonToCreateSession.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_createSessionFragment)
        }
        binding.buttonToFavoriteMovies.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_favoriteMoviesFragment)
        }
        binding.buttonToConnectingToSession.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_connectingSessionFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
