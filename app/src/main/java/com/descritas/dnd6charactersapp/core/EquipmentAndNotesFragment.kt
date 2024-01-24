package com.descritas.dnd6charactersapp.core

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.descritas.dnd6charactersapp.databinding.FragmentEquipmentAndNotesBinding


class EquipmentAndNotesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEquipmentAndNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

}