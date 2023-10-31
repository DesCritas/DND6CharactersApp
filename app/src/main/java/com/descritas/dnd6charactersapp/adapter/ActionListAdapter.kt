package com.descritas.dnd6charactersapp.adapter



import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor

import androidx.recyclerview.widget.RecyclerView
import com.descritas.dnd6charactersapp.R

import com.descritas.dnd6charactersapp.databinding.ActionCardBinding

import com.descritas.dnd6charactersapp.dto.ActionCard


class ActionListAdapter(
    private val actionsList: List<ActionCard>
    ) : RecyclerView.Adapter<ActionListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionListAdapter.ViewHolder{
        val binding = ActionCardBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return actionsList.size
    }

    override fun onBindViewHolder(holder: ActionListAdapter.ViewHolder, position: Int) {
        val action = actionsList[position]
        holder.bind(action)
    }



    inner class ViewHolder(private val binding: ActionCardBinding) : RecyclerView.ViewHolder(binding.root) {

        val colorDefaultInt = ContextCompat.getColor(binding.root.context, R.color.black)
        val colorRedInt = ContextCompat.getColor(binding.root.context, R.color.material600red)
        val colorOrangeInt = ContextCompat.getColor(binding.root.context, R.color.material600orange)
        val colorYellowInt = ContextCompat.getColor(binding.root.context, R.color.material600yellow)
        val colorGreenInt = ContextCompat.getColor(binding.root.context, R.color.material600green)
        val colorBlueInt = ContextCompat.getColor(binding.root.context, R.color.material600blue)
        val colorPurpleInt = ContextCompat.getColor(binding.root.context, R.color.material600purple)


        fun bind(card: ActionCard){

            with(binding){

                //root.setCardBackgroundColor(actSkillToColor(card.actionSkill))
                root.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.white))
                val changer: GradientDrawable = typeAct.background.mutate() as GradientDrawable
                changer.setColor(actSkillToColor(card.actionSkill))
                typeAct.text = card.actionType
                tool.text= card.tool
                damageType.text = card.damageType
                range.text = card.range
                area.text = card.area
                damage.text = card.damage
                check.text = card.check
            }
        }

    }



}

private fun ActionListAdapter.ViewHolder.actSkillToColor(actionSkill: String): Int {
    val colorMap: Map<String, Int> = mapOf(
        Pair("Fighting", colorRedInt),
        Pair("Crafting", colorYellowInt),
        Pair("Spell-Casting", colorBlueInt),
        Pair("Sociability", colorOrangeInt),
        Pair("Spying", colorPurpleInt),
        Pair("Exploration", colorGreenInt)
    )
    return if (colorMap[actionSkill]==null){
        colorDefaultInt
    } else {
        colorMap[actionSkill]!!
    }

}