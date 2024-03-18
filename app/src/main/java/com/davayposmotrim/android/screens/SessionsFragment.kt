package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentCreateSessionBinding
import com.davayposmotrim.android.databinding.FragmentSessionsBinding

class SessionsFragment : BaseFragment<FragmentSessionsBinding>(FragmentSessionsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToMovieFromSessions.setOnClickListener {
            findNavController().navigate(R.id.action_sessionsFragment_to_movieFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}

//class SessionsFragment : Fragment(R.layout.fragment_sessions) {
//    private var _binding: FragmentSessionsBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentSessionsBinding.inflate(inflater, container, false)
//        binding.buttonToMovieFromSessions.setOnClickListener {
//            findNavController().navigate(R.id.action_sessionsFragment_to_movieFragment)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}