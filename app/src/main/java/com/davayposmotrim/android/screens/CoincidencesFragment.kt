package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentCoincidencesBinding

class CoincidencesFragment : Fragment(R.layout.fragment_coincidences) {
    private var _binding: FragmentCoincidencesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCoincidencesBinding.inflate(inflater, container, false)
        binding.buttonToMovie.setOnClickListener {
            findNavController().navigate(R.id.action_coincidencesFragment_to_movieFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
