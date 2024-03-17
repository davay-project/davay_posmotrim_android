package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentInvitingUsersBinding
import com.davayposmotrim.android.databinding.FragmentMovieSelectionBinding

class MovieSelectionFragment : BaseFragment<FragmentMovieSelectionBinding>(FragmentMovieSelectionBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
        binding.buttonMatch.setOnClickListener {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_matchesFragment)
        }
        binding.buttonCoincidence.setOnClickListener {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_coincidencesFragment)
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.action_movieSelectionFragment_to_alertDialogLeaveSession)
        }
        return super.onCreateView(inflater, container, savedInstaceState)
    }
}

//class MovieSelectionFragment : Fragment(R.layout.fragment_movie_selection) {
//    private var _binding: FragmentMovieSelectionBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentMovieSelectionBinding.inflate(inflater, container, false)
//        binding.buttonMatch.setOnClickListener {
//            findNavController().navigate(R.id.action_movieSelectionFragment_to_matchesFragment)
//        }
//        binding.buttonCoincidence.setOnClickListener {
//            findNavController().navigate(R.id.action_movieSelectionFragment_to_coincidencesFragment)
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
//            findNavController().navigate(R.id.action_movieSelectionFragment_to_alertDialogLeaveSession)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}