package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentInvitingUsersBinding
import com.davayposmotrim.android.screens.alertDialogs.AlertDialogCancelSessionFragment

class InvitingUsersFragment : Fragment(R.layout.fragment_inviting_users) {

    private var _binding: FragmentInvitingUsersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInvitingUsersBinding.inflate(inflater, container, false)


        binding.buttonCancelSession.setOnClickListener {
         findNavController().navigate(R.id.action_invitingUsersFragment_to_alertDialogCancelSessionFragment)
        }
        binding.buttonStart.setOnClickListener {
            findNavController().navigate(R.id.action_invitingUsersFragment_to_movieSelectionFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}