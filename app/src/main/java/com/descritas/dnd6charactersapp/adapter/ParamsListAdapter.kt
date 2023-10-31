package com.descritas.dnd6charactersapp.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.descritas.dnd6charactersapp.databinding.CardUnitBinding
import com.descritas.dnd6charactersapp.dto.ParameterCard

class ParamsListAdapter(private val items: List<ParameterCard>) : RecyclerView.Adapter<ParamsListAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardUnitBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(private val binding: CardUnitBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(card: ParameterCard){
            with(binding){
                parametrUnit.text = card.parameter
                parametrScore.text = card.score
            }
        }
    }
}