package com.descritas.dnd6charactersapp.activity

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.RelativeSizeSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.descritas.dnd6charactersapp.adapter.ParamsListAdapter
import com.descritas.dnd6charactersapp.databinding.FragmentMainInfoBinding
import com.descritas.dnd6charactersapp.dto.ParameterCard


class MainInfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val proportion = 1.3f
        val initiativeHeader = "Initiative "
        val hpHeader = "HP "
        val speedHeader = "Speed "
        val armorHeader = "Armor"
        val hitDiceHeader = "Hit Dice "
        val levelHeader = "Level "

        val initiative = "23"
        val healthPoints = "789"
        val maxHP = "899"
        val speed = "30"+"ft"
        val armor = "15"
        val hitDice = "1d8 +\n3d10"
        val level = "10"

        val binding = FragmentMainInfoBinding.inflate(inflater, container, false)
        //val spannableString = SpannableString("$initiativeHeader \n$initiative")
        //spannableString.setSpan(RelativeSizeSpan(proportion), initiativeHeader.length + 1, spannableString.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        //val spannableString2 = SpannableString("HP \n$healthPoints/\n$maxHP")
       // spannableString2.setSpan(RelativeSizeSpan(proportion), 4, spannableString2.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        //val spannableString3 = SpannableString("Speed \n$speed")
        //spannableString3.setSpan(RelativeSizeSpan(proportion), 7, spannableString3.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val initiativeText = spannedText(initiativeHeader, initiative, null)
        val healthPointsText = spannedText(hpHeader, healthPoints, maxHP)
        val speedText = spannedText(speedHeader, speed, null)
        val hitDiceText = spannedText(hitDiceHeader, hitDice, null)
        val levelText = spannedText(levelHeader, level, null)
        val armorClass = spannedText(armorHeader, armor, null)

        binding.initiative.text = initiativeText
        binding.hp.text = healthPointsText
        binding.speed.text = speedText
        binding.armorClass.text = armorClass
        binding.hitDice.text = hitDiceText
        binding.level.text = levelText


        val recyclerView1 = binding.cardAbilityList.parameterList
        val recyclerView2 = binding.cardSkillList.parameterList
        val abilityList = listOf(
            ParameterCard("Strength","+1"),
            ParameterCard("Agility","0"),
            ParameterCard("Constitution","+2"),
            ParameterCard("Intelligence","-1"),
            ParameterCard("Wisdom","+3"),
            ParameterCard("Charisma","0")
        )
        val skillList = listOf(
            ParameterCard("Fighting","+3"),
            ParameterCard("Spying","0"),
            ParameterCard("Crafting","+2"),
            ParameterCard("Spell-Casting","-1"),
            ParameterCard("Exploration","+2"),
            ParameterCard("Sociability","+3")
        )
        val adapter1 = ParamsListAdapter(abilityList)
        val adapter2 = ParamsListAdapter(skillList)
        binding.cardAbilityList.parameter.text = "Abilities"
        binding.cardSkillList.parameter.text = "Skills"
        recyclerView1.adapter = adapter1
        recyclerView2.adapter = adapter2
        recyclerView1.layoutManager = LinearLayoutManager(this.context)
        recyclerView2.layoutManager = LinearLayoutManager(this.context)

        //val standardWidth = binding.speed.width
        //val layoutParams = binding.initiative.layoutParams
        //val layoutParams2 = binding.armorClass.layoutParams
        //val layoutParams3 = binding.level.layoutParams
        //layoutParams.width = standardWidth
        //layoutParams2.width = standardWidth
        //layoutParams3.width = standardWidth
        //binding.initiative.layoutParams = layoutParams
        //binding.armorClass.layoutParams = layoutParams2
        //binding.level.layoutParams = layoutParams3




        return binding.root

    }

    private fun spannedText (
        string1: String,
        string2: String,
        string3: String?
    ): SpannableString{
        val proportion = 1.3f
        val spannableString= if(string3 == null)
        {
            SpannableString("$string1\n$string2")
        }else{
            SpannableString("$string1\n$string2\n$string3")
        }

        spannableString.setSpan(
            RelativeSizeSpan(proportion),
            string1.length,
            spannableString.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        return spannableString
    }

}