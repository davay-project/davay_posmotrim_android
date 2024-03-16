package com.example.uikit_sample.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uikit_sample.databinding.FragmentCustomViewListBinding
import com.example.uikit_sample.ui.adapters.CustomElementListAdapter

class CustomViewListFragment : Fragment() {

    private lateinit var binding: FragmentCustomViewListBinding
    private lateinit var adapter: CustomElementListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCustomViewListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CustomElementListAdapter(requireContext())
        val layoutManager = LinearLayoutManager(requireContext())
        binding.customElementList.layoutManager = layoutManager
        binding.customElementList.adapter = adapter
    }

    companion object {
        fun newInstance() = CustomViewListFragment()
    }
}
