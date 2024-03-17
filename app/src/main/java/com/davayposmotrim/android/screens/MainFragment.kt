package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
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
        return super.onCreateView(inflater, container, savedInstaceState)
    }
}

//class MainFragment : Fragment(R.layout.fragment_main) {
//    private var _binding: FragmentMainBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentMainBinding.inflate(inflater, container, false)
//        binding.buttonToEditName.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_editNameFragment)
//        }
//        binding.buttonToCreateSession.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_createSessionFragment)
//        }
//        binding.buttonToFavoriteMovies.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_favoriteMoviesFragment)
//        }
//        binding.buttonToConnectingToSession.setOnClickListener {
//            findNavController().navigate(R.id.action_mainFragment_to_connectingSessionFragment)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}