package com.descritas.dnd6charactersapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.descritas.dnd6charactersapp.databinding.FeaturesElementBinding

import com.descritas.dnd6charactersapp.dto.SpecialActionCard

class SpecialActionsAdapter(
    private val specialsList: List<SpecialActionCard>
) : RecyclerView.Adapter<SpecialActionsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FeaturesElementBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return specialsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val action = specialsList[position]
        holder.bind(action)
    }

    inner class ViewHolder(private val binding: FeaturesElementBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: SpecialActionCard) {
            with(binding){

                //root.setCardBackgroundColor(actSkillToColor(card.actionSkill))
                //root.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.white))
                //val changer: GradientDrawable = typeAct.background.mutate() as GradientDrawable
                //changer.setColor(actSkillToColor(card.actionSkill))
                skillType.text = card.skillType
                featureName.text = card.actionName
                featureType.text = card.actionType
                castTime.text = card.castTime
                consumptions.text = card.consumptions
                duration.text = card.duration
                components.text = card.components
                descriptionText.text = card.descriptionText
                castRequirements.text = card.castRequirements
                checkDifficulty.text = card.checkDifficulty
            }

        }
    }


}