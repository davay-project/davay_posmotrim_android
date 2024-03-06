package com.example.uikit_sample.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uikit_sample.R

class DavayMovieEvaluationFragment : Fragment() {

    companion object {
        fun newInstance() = DavayMovieEvaluationFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_davay_movie_evaluation, container, false)
    }
}