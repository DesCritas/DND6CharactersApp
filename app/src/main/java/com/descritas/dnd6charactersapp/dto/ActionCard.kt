package com.descritas.dnd6charactersapp.dto

data class ActionCard(
    val actionType: String,
    val actionSkill: String,
    val actionBonus: String,
    val tool: String,
    val damageType: String,
    val range: String,
    val area: String,
    val damage: String,
    val check: String,
    val details: String
)