package com.davayposmotrim.android.screens.alertDialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.databinding.FragmentAlertDialogLeaveSessionBinding

class AlertDialogLeaveSession : DialogFragment() {
    private var _binding: FragmentAlertDialogLeaveSessionBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAlertDialogLeaveSessionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCancelSession.setOnClickListener {
            findNavController().navigate(R.id.action_alertDialogLeaveSession_to_favoriteMoviesFragment)
            dismiss()
        }
        binding.buttonContinue.setOnClickListener {
            dismiss()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
