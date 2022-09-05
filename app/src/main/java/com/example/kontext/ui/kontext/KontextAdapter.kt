package com.example.kontext.ui.kontext

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kontext.R
import com.example.kontext.network.KontextData

class KontextAdapter : ListAdapter<KontextData, KontextAdapter.KontextDataViewHolder>(DiffCallback) {
    class KontextDataViewHolder(private var binding: ViewDataBinding) : RecyclerView.ViewHolder() {
        fun bind(kontextData: KontextData?) {


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KontextDataViewHolder {
        val layout = LayoutInflater.from(this).inflate(R.layout.kontext_cardview, parent, false)
        return KontextDataViewHolder()
    }

    override fun onBindViewHolder(holder: KontextDataViewHolder, position: Int) {
        val kontextData = getItem(position)
        holder.bind(kontextData)
    }
}