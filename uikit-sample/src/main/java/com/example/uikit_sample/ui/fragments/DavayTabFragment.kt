package com.example.uikit_sample.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uikit_sample.R
import com.example.uikit_sample.ui.viewmodels.DavayTabViewModel

class DavayTabFragment : Fragment() {

    companion object {
        fun newInstance() = DavayTabFragment()
    }

    private lateinit var viewModel: DavayTabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_davay_tab, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DavayTabViewModel::class.java)
        // TODO: Use the ViewModel
    }

}