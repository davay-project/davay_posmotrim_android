package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentIntroductoryBinding

class IntroductoryFragment : Fragment(R.layout.fragment_introductory) {
    private var _binding: FragmentIntroductoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroductoryBinding.inflate(inflater, container, false)
        binding.buttonToRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_introductoryFragment_to_registrationFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
