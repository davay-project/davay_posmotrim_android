package com.davayposmotrim.android.screens

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.MainActivity
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentInvitingUsersBinding
import com.davayposmotrim.android.databinding.FragmentRegistrationBinding

class InvitingUsersFragment : Fragment(R.layout.fragment_inviting_users) {

    private var _binding: FragmentInvitingUsersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInvitingUsersBinding.inflate(inflater, container, false)


        binding.buttonCancelSession.setOnClickListener {
            val dialogFragment = AlertDialogCancelSessionFragment()
            dialogFragment.show(requireFragmentManager(), "dialog")
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