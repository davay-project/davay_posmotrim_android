package com.example.uikit_sample.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.uikit_sample.R
import com.example.uikit_sample.databinding.FragmentCustomViewListBinding
import com.example.uikit_sample.ui.adapters.CustomElementListAdapter
import com.example.uikit_sample.ui.viewmodels.CustomViewListViewModel

class CustomViewListFragment : Fragment() {

    private lateinit var viewModel: CustomViewListViewModel
    private lateinit var binding: FragmentCustomViewListBinding
    private lateinit var adapter: CustomElementListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCustomViewListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CustomViewListViewModel::class.java)
        adapter = CustomElementListAdapter()
        val layoutManager = LinearLayoutManager(view.context)
        binding.customElementList.layoutManager = layoutManager
        binding.customElementList.adapter = adapter

    }

    companion object {
        fun newInstance() = CustomViewListFragment()
    }
}