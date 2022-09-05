package com.example.kontest

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kontest.network.KontestData
import com.example.kontest.ui.kontest.KontestAdapter
import com.example.kontest.ui.kontest.KontestApiStatus

@BindingAdapter("listData")
fun bindingRecyclerView(recyclerView: RecyclerView, data: List<KontestData>?) {
    val adapter = recyclerView.adapter as KontestAdapter
    adapter.submitList(data)
}

@BindingAdapter("kontestApiStatus")
fun bindStatus(statusImageView: ImageView, status: KontestApiStatus?) {
    when (status) {
        KontestApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        KontestApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        KontestApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
        null -> TODO()
    }
}