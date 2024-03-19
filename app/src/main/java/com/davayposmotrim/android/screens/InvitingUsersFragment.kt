package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentInvitingUsersBinding

class InvitingUsersFragment :
    BaseFragment<FragmentInvitingUsersBinding>(FragmentInvitingUsersBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonStart.setOnClickListener {
            findNavController().navigate(R.id.action_invitingUsersFragment_to_movieSelectionFragment)
        }
        binding.buttonCancelSession.setOnClickListener {
            findNavController().navigate(R.id.action_invitingUsersFragment_to_alertDialogCancelSessionFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
