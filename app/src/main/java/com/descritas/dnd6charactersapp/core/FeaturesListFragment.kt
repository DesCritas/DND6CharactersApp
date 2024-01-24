package com.descritas.dnd6charactersapp.core

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.descritas.dnd6charactersapp.adapter.FeaturesListAdapter
import com.descritas.dnd6charactersapp.databinding.FragmentFeaturesListBinding
import com.descritas.dnd6charactersapp.dto.FeatureCard


class FeaturesListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFeaturesListBinding.inflate(inflater, container, false)
        val featuresListRW = binding.root

        val featuresList = listOf<FeatureCard>(
            FeatureCard(
                "Fighting",
                "Maneuver",
                "Active",
                "various",
                "various",
                "various",
                "various",
                "Combat Superiority Maneuvers.You learn three fighting maneuvers of your choice, which are listed under Maneuvers table below. Many maneuvers enhance an attack in some way. You can use only one maneuver per action. Enemy ability check. Some of your maneuvers require your target to make an characteristic check (CC) to resist the maneuver's effects.The difficulty is calculated as follows: Check Difficulty (CD)[CC] = 1d20 + your fighting ability modifier(FAM)",
                "none",
                "1d20+FAM"
            ),
            FeatureCard(
                "Fighting",
                "Maneuver",
                "Active",
                "various",
                "various",
                "various",
                "various",
                "Combat Superiority Maneuvers.You learn three fighting maneuvers of your choice, which are listed under Maneuvers table below. Many maneuvers enhance an attack in some way. You can use only one maneuver per action. Enemy ability check. Some of your maneuvers require your target to make an characteristic check (CC) to resist the maneuver's effects.The difficulty is calculated as follows: Check Difficulty (CD)[CC] = 1d20 + your fighting ability modifier(FAM)",
                "none",
                "1d20+FAM"
            ),
            FeatureCard(
                "Fighting",
                "Maneuver",
                "Active",
                "various",
                "various",
                "various",
                "various",
                "Combat Superiority Maneuvers.You learn three fighting maneuvers of your choice, which are listed under Maneuvers table below. Many maneuvers enhance an attack in some way. You can use only one maneuver per action. Enemy ability check. Some of your maneuvers require your target to make an characteristic check (CC) to resist the maneuver's effects.The difficulty is calculated as follows: Check Difficulty (CD)[CC] = 1d20 + your fighting ability modifier(FAM)",
                "none",
                "1d20+FAM"
            ),
            FeatureCard(
                "Fighting",
                "Maneuver",
                "Active",
                "various",
                "various",
                "various",
                "various",
                "Combat Superiority Maneuvers.You learn three fighting maneuvers of your choice, which are listed under Maneuvers table below. Many maneuvers enhance an attack in some way. You can use only one maneuver per action. Enemy ability check. Some of your maneuvers require your target to make an characteristic check (CC) to resist the maneuver's effects.The difficulty is calculated as follows: Check Difficulty (CD)[CC] = 1d20 + your fighting ability modifier(FAM)",
                "none",
                "1d20+FAM"
            )
            )
        val adapter = FeaturesListAdapter(featuresList)
        featuresListRW.adapter = adapter
        featuresListRW.layoutManager = LinearLayoutManager(this.context)

        return binding.root
    }


}