package com.example.kontest.ui.kontest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.viewModels
import com.example.kontest.R
import com.example.kontest.databinding.FragmentKontestBinding

class KontestFragment : Fragment() {

    private val viewModel: KontextViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentKontestBinding.inflate(inflater)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.contestData.adapter = KontestAdapter()

        return binding.root
    }
}