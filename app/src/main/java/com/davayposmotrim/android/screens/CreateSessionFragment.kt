package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentCreateSessionBinding

class CreateSessionFragment :
    BaseFragment<FragmentCreateSessionBinding>(FragmentCreateSessionBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToInvitingUsers.setOnClickListener {
            findNavController().navigate(R.id.action_createSessionFragment_to_invitingUsersFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
