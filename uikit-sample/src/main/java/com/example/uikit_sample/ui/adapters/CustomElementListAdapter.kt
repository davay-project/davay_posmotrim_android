package com.example.uikit_sample.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.uikit_sample.databinding.ListItemCustomViewBinding
import com.example.uikit_sample.model.CustomElement

class CustomElementListAdapter : RecyclerView.Adapter<CustomElementListAdapter.CustomElementViewHolder>() {

    val customElements = listOf(
        CustomElement("DavayBannerView"),
        CustomElement("DavayButtonView"),
        CustomElement("DavayFilmView"),
        CustomElement("DavayMovieEvaluationView"),
        CustomElement("DavayMovieSelectionView"),
        CustomElement("DavaySessionView"),
        CustomElement("DavayTabView"),
        CustomElement("DavayTagView")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomElementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemCustomViewBinding.inflate(inflater, parent, false)
        return CustomElementViewHolder(binding)
    }

    override fun getItemCount(): Int = customElements.size

    override fun onBindViewHolder(holder: CustomElementViewHolder, position: Int) {
        val element = customElements[position]
        with(holder.binding) {
            customElementName.text = element.name
        }
    }

    class CustomElementViewHolder(val binding: ListItemCustomViewBinding) : RecyclerView.ViewHolder(binding.root){

    }
}