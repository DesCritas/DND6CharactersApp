package com.descritas.dnd6charactersapp.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.descritas.dnd6charactersapp.adapter.SpecialActionsAdapter
import com.descritas.dnd6charactersapp.databinding.FragmentSpecialActionsBinding
import com.descritas.dnd6charactersapp.dto.SpecialActionCard

class SpecialActionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSpecialActionsBinding.inflate(inflater, container, false)
        val actionsListRW = binding.root

        val actionsList = listOf<SpecialActionCard>(
            SpecialActionCard(
                "Spell-Casting",
                "Fireball",
                "Active",
                "1 action",
                "5 MP",
                "Moment",
                "needs wand, free hand, verbal",
                "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one. The fire spreads around corners. It ignites flammable objects in the area that aren't being worn or carried.,",
                "none",
                "1d20+SAM"
            ),
            SpecialActionCard(
                "Spell-Casting",
                "Fireball",
                "Active",
                "1 action",
                "5 MP",
                "Moment",
                "needs wand, free hand, verbal",
                "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one. The fire spreads around corners. It ignites flammable objects in the area that aren't being worn or carried.,",
                "none",
                "1d20+SAM"
            ),
            SpecialActionCard(
                "Spell-Casting",
                "Fireball",
                "Active",
                "1 action",
                "5 MP",
                "Moment",
                "needs wand, free hand, verbal",
                "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one. The fire spreads around corners. It ignites flammable objects in the area that aren't being worn or carried.,",
                "none",
                "1d20+SAM"
            ),
            SpecialActionCard(
                "Spell-Casting",
                "Fireball",
                "Active",
                "1 action",
                "5 MP",
                "Moment",
                "needs wand, free hand, verbal",
                "A bright streak flashes from your pointing finger to a point you choose within range and then blossoms with a low roar into an explosion of flame. Each creature in a 20-foot-radius sphere centered on that point must make a Dexterity saving throw. A target takes 8d6 fire damage on a failed save, or half as much damage on a successful one. The fire spreads around corners. It ignites flammable objects in the area that aren't being worn or carried.,",
                "none",
                "1d20+SAM"
            )
        )

        val adapter = SpecialActionsAdapter(actionsList)
        actionsListRW.adapter = adapter
        actionsListRW.layoutManager = LinearLayoutManager(this.context)





        return binding.root
    }
}