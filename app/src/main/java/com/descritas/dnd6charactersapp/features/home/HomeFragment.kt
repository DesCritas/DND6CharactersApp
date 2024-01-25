package com.descritas.dnd6charactersapp.features.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.descritas.dnd6charactersapp.R
import com.descritas.dnd6charactersapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.textHome.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pageFragment)
        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_home, container, false)
    }

}