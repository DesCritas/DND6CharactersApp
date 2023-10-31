package com.descritas.dnd6charactersapp.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.descritas.dnd6charactersapp.adapter.ActionListAdapter
import com.descritas.dnd6charactersapp.adapter.ParamsListAdapter
import com.descritas.dnd6charactersapp.databinding.FragmentMainActionsBinding
import com.descritas.dnd6charactersapp.dto.ActionCard
import com.descritas.dnd6charactersapp.dto.ParameterCard


class MainActionsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainActionsBinding.inflate(inflater, container, false)

        val actionList = binding.actionList
        val skillList = listOf(
            ActionCard(
                "ATK",
                "Fighting",
                "+3",
                "knife",
                "piercing",
                "20/40 ft",
                "1 foe",
                "1d4+1",
                "Armor",
                "none"
            ),
            ActionCard(
                "ATK",
                "Spell-Casting",
                "+3",
                "magic wand",
                "various",
                "30/60 ft",
                "1 foe",
                "2d4+4",
                "Armor",
                "none"
            ),
            ActionCard(
                "ATK",
                "Exploration",
                "+2",
                "magic prism",
                "various",
                "self side",
                "15 ft cone",
                "1d6+2 or none",
                "Agility",
                "none"
            ),
            ActionCard(
                "ATK",
                "Crafting",
                "+1",
                "throw bomb",
                "various",
                "20/40 ft",
                "20 ft sphere",
                "various",
                "Agility",
                "none"
            ),
            ActionCard(
                "ATK",
                "Spying",
                "+3",
                "Crossbow",
                "piercing",
                "60/120 ft",
                "1 foe",
                "1d4+1",
                "Armor",
                "none"
            ),
            ActionCard(
                "SKL",
                "Sociability",
                "+3",
                "Makeup",
                "none",
                "self",
                "60 ft radius",
                "effect",
                "Charisma",
                "description"
            )
        )

        val adapter = ActionListAdapter(skillList)
        actionList.adapter = adapter
        actionList.layoutManager = LinearLayoutManager(this.context)


        return binding.root
    }

}