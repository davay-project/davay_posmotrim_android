package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentIntroductoryBinding

class IntroductoryFragment :
    BaseFragment<FragmentIntroductoryBinding>(FragmentIntroductoryBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_introductoryFragment_to_registrationFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}

//class IntroductoryFragment : Fragment(R.layout.fragment_introductory) {
//    private var _binding: FragmentIntroductoryBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentIntroductoryBinding.inflate(inflater, container, false)
//        binding.buttonToRegistration.setOnClickListener {
//            findNavController().navigate(R.id.action_introductoryFragment_to_registrationFragment)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}