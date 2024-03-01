package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentInvitingUsersBinding
import com.davayposmotrim.android.databinding.FragmentMovieSelectionBinding

class MovieSelectionFragment:Fragment(R.layout.fragment_movie_selection) {

    private var _binding: FragmentMovieSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieSelectionBinding.inflate(inflater, container, false)


        binding.buttonMatch.setOnClickListener {

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}