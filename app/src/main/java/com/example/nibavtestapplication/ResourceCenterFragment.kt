package com.example.nibavtestapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.nibavtestapplication.databinding.FragmentAllNewsBinding
import com.example.nibavtestapplication.databinding.FragmentResourceCenterBinding

class ResourceCenterFragment : Fragment() {

    lateinit var binding : FragmentResourceCenterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentResourceCenterBinding.inflate(layoutInflater)
        return binding.root

    }
}