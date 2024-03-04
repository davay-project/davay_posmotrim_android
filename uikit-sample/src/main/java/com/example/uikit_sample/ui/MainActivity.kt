package com.example.uikit_sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uikit_sample.R
import com.example.uikit_sample.databinding.ActivityMainBinding
import com.example.uikit_sample.ui.fragments.CustomViewListFragment

class MainActivity : AppCompatActivity() {

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
}