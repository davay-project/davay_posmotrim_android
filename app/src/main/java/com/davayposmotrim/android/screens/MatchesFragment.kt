package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentMatchesBinding

class MatchesFragment : BaseFragment<FragmentMatchesBinding>(FragmentMatchesBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonContinueSession.setOnClickListener {
            findNavController().popBackStack(R.id.movieSelectionFragment, false)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}
