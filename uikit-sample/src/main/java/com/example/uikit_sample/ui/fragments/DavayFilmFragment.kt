package com.example.uikit_sample.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uikit_sample.R
import com.example.uikit_sample.ui.viewmodels.DavayFilmViewModel

class DavayFilmFragment : Fragment() {

    companion object {
        fun newInstance() = DavayFilmFragment()
    }

    private lateinit var viewModel: DavayFilmViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_davay_film, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DavayFilmViewModel::class.java)
        // TODO: Use the ViewModel
    }

}