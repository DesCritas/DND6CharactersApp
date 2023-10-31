package com.descritas.dnd6charactersapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.descritas.dnd6charactersapp.activity.CharacterPortraitFragment
import com.descritas.dnd6charactersapp.activity.EquipmentAndNotesFragment
import com.descritas.dnd6charactersapp.activity.MainActionsFragment
import com.descritas.dnd6charactersapp.activity.MainInfoFragment
import com.descritas.dnd6charactersapp.activity.FeaturesListFragment
import com.descritas.dnd6charactersapp.activity.SpecialActionsFragment


class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> CharacterPortraitFragment()
            1 -> MainInfoFragment()
            2 -> MainActionsFragment()
            3 -> FeaturesListFragment()
            4 -> SpecialActionsFragment()
            5 -> EquipmentAndNotesFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        return 6
    }
}
