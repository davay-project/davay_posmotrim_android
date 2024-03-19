package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentMovieSelectionBinding

class MovieSelectionFragment :
    BaseFragment<FragmentMovieSelectionBinding>(FragmentMovieSelectionBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonMatch.setOnClickListener {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_matchesFragment)
        }
        binding.buttonCoincidence.setOnClickListener {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_coincidencesFragment)
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_alertDialogLeaveSession)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
