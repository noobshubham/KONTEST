package com.example.kontest.ui.kontest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kontest.databinding.KontestCardviewBinding
import com.example.kontest.network.KontestData

class KontestAdapter : ListAdapter<KontestData, KontestAdapter.KontestViewHolder>(DiffCallback) {
    class KontestViewHolder(private var binding: KontestCardviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(kontestData: KontestData?) {
            if (kontestData != null) {
                binding.nameOfContest.text = kontestData.name
                binding.status.text = kontestData.status
                binding.startTime.text = kontestData.start_time
                binding.duration.text = kontestData.duration
                binding.website.text = kontestData.site
                binding.executePendingBindings()
            }
        }

    }

    companion object DiffCallback : DiffUtil.ItemCallback<KontestData>() {
        override fun areItemsTheSame(oldItem: KontestData, newItem: KontestData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: KontestData, newItem: KontestData): Boolean {
            return oldItem.site == newItem.site
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KontestAdapter.KontestViewHolder {
        return KontestViewHolder(KontestCardviewBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: KontestViewHolder, position: Int) {
        val kontextData = getItem(position)
        holder.bind(kontextData)
    }
}
