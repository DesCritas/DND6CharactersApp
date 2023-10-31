package com.descritas.dnd6charactersapp.adapter

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.descritas.dnd6charactersapp.R
import com.descritas.dnd6charactersapp.databinding.ActionCardBinding
import com.descritas.dnd6charactersapp.databinding.FeaturesElementBinding
import com.descritas.dnd6charactersapp.dto.ActionCard
import com.descritas.dnd6charactersapp.dto.FeatureCard

class FeaturesListAdapter(
    private val featuresList: List<FeatureCard>
    ) : RecyclerView.Adapter<FeaturesListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FeaturesElementBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return featuresList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val action = featuresList[position]
        holder.bind(action)
    }

    inner class ViewHolder(private val binding: FeaturesElementBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: FeatureCard) {
            with(binding){

                //root.setCardBackgroundColor(actSkillToColor(card.actionSkill))
                //root.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.white))
                //val changer: GradientDrawable = typeAct.background.mutate() as GradientDrawable
                //changer.setColor(actSkillToColor(card.actionSkill))
                skillType.text = card.skillType
                featureName.text = card.featureName
                featureType.text = card.featureType
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