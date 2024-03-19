package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentFavoriteMoviesBinding

class FavoriteMoviesFragment :
    BaseFragment<FragmentFavoriteMoviesBinding>(FragmentFavoriteMoviesBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonToSessions.setOnClickListener {
            findNavController().navigate(R.id.action_favoriteMoviesFragment_to_sessionsFragment)
        }
    }
}
