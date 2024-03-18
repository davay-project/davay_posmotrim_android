package com.davayposmotrim.android.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.davayposmotrim.android.R
import com.davayposmotrim.android.base.BaseFragment
import com.davayposmotrim.android.databinding.FragmentFavoriteMoviesBinding
import com.davayposmotrim.android.databinding.FragmentMovieBinding

class FavoriteMoviesFragment : BaseFragment<FragmentFavoriteMoviesBinding>(FragmentFavoriteMoviesBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToSessions.setOnClickListener {
            findNavController().navigate(R.id.action_favoriteMoviesFragment_to_sessionsFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

}


//class FavoriteMoviesFragment : Fragment(R.layout.fragment_favorite_movies) {
//    private var _binding: FragmentFavoriteMoviesBinding? = null
//    private val binding get() = _binding!!
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentFavoriteMoviesBinding.inflate(inflater, container, false)
//        binding.buttonToSessions.setOnClickListener {
//            findNavController().navigate(R.id.action_favoriteMoviesFragment_to_sessionsFragment)
//        }
//        return binding.root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}