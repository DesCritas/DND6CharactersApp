package com.descritas.dnd6charactersapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.descritas.dnd6charactersapp.databinding.FragmentCharacterPortraitBinding


class CharacterPortraitFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCharacterPortraitBinding.inflate(inflater, container, false)
        return binding.root

    }
}