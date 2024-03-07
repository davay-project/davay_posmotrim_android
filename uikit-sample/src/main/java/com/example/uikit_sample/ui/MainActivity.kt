package com.example.uikit_sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.uikit_sample.R
import com.example.uikit_sample.databinding.ActivityMainBinding
import com.example.uikit_sample.model.Elements
import com.example.uikit_sample.ui.adapters.ClickEventHandler
import com.example.uikit_sample.ui.adapters.CustomElementListAdapter
import com.example.uikit_sample.ui.fragments.CustomViewListFragment
import com.example.uikit_sample.ui.fragments.DavayBannerFragment
import com.example.uikit_sample.ui.fragments.DavayButtonFragment
import com.example.uikit_sample.ui.fragments.DavayFilmFragment
import com.example.uikit_sample.ui.fragments.DavayMovieEvaluationFragment
import com.example.uikit_sample.ui.fragments.DavayMovieSelectionFragment
import com.example.uikit_sample.ui.fragments.DavaySessionFragment
import com.example.uikit_sample.ui.fragments.DavayTabFragment
import com.example.uikit_sample.ui.fragments.DavayTagFragment

class MainActivity : AppCompatActivity(), ClickEventHandler {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, CustomViewListFragment())
            .commit()
    }

    override fun navigateToFragment(holder: CustomElementListAdapter.CustomElementViewHolder) {
        when(holder.binding.customElementType.id) {
            Elements.DavayBannerView.ordinal -> launchFragment(DavayBannerFragment())
            Elements.DavayButtonView.ordinal -> launchFragment(DavayButtonFragment())
            Elements.DavayFilmView.ordinal -> launchFragment(DavayFilmFragment())
            Elements.DavayMovieEvaluationView.ordinal -> launchFragment(DavayMovieEvaluationFragment())
            Elements.DavayMovieSelectionView.ordinal -> launchFragment(DavayMovieSelectionFragment())
            Elements.DavaySessionView.ordinal -> launchFragment(DavaySessionFragment())
            Elements.DavayTabView.ordinal -> launchFragment(DavayTabFragment())
            Elements.DavayTagView.ordinal -> launchFragment(DavayTagFragment())
        }
    }

    private fun launchFragment(fragment: Fragment, container: Int = R.id.fragment_container_view) {
        supportFragmentManager
            .beginTransaction()
            .replace(container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
