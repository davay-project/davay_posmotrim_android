package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentCoincidencesBinding
import com.davayposmotrim.android.databinding.FragmentConnectingSessionBinding
import com.davayposmotrim.android.databinding.FragmentCreateSessionBinding
import com.davayposmotrim.android.databinding.FragmentRegistrationBinding

class CreateSessionFragment : BaseFragment<FragmentCreateSessionBinding>(FragmentCreateSessionBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstaceState: Bundle?
    ): View? {
        binding.buttonToInvitingUsers.setOnClickListener {
            findNavController().navigate(R.id.action_createSessionFragment_to_invitingUsersFragment)
        }
        return super.onCreateView(inflater, container, savedInstaceState)
    }
}

//class CreateSessionFragment : Fragment(R.layout.fragment_create_session) {
//    private var _binding: FragmentCreateSessionBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentCreateSessionBinding.inflate(inflater, container, false)
//        binding.buttonToInvitingUsers.setOnClickListener {
//            findNavController().navigate(R.id.action_createSessionFragment_to_invitingUsersFragment)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}