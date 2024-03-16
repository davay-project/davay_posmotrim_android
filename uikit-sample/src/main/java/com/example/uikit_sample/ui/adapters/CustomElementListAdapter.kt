package com.example.uikit_sample.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uikit_sample.databinding.ListItemCustomViewBinding
import com.example.uikit_sample.model.Elements

class CustomElementListAdapter(context: Context) :
    RecyclerView.Adapter<CustomElementListAdapter.CustomElementViewHolder>() {

    private val clickHandler: ClickEventHandler = context as ClickEventHandler

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomElementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemCustomViewBinding.inflate(inflater, parent, false)
        return CustomElementViewHolder(binding)
    }

    override fun getItemCount(): Int = Elements.entries.size

    override fun onBindViewHolder(holder: CustomElementViewHolder, position: Int) {
        val element = Elements.entries[position]
        with(holder.binding) {
            customElementType.id = Elements.valueOf(element.name).ordinal
            customElementType.text = element.name
            holder.itemView.setOnClickListener {
                clickHandler.navigateToFragment(holder)
            }
        }
    }

    class CustomElementViewHolder(val binding: ListItemCustomViewBinding) :
        RecyclerView.ViewHolder(binding.root)
}
