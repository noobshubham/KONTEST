package com.example.kontext.ui.kontext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.kontext.R

class KontextFragment : Fragment() {

    private val viewModel: KontextViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =
        return inflater.inflate(R.layout.fragment_kontext, container, false)
    }
}