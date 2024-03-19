package com.davayposmotrim.android.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>(private val bindingInflater: (LayoutInflater) -> VB) : Fragment() {
    private var _binding: VB? = null
    val binding: VB
        get() = _binding ?: throw IllegalArgumentException("Binding не может быть null")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstaceState: Bundle?): View? {
        _binding = bindingInflater(inflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
