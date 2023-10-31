package com.descritas.dnd6charactersapp.dto

data class SpecialActionCard (
    val skillType: String,
    val actionName: String,
    val actionType: String,
    val castTime: String,
    val consumptions: String,
    val duration: String,
    val components: String,
    val descriptionText: String,
    val castRequirements: String,
    val checkDifficulty: String
)
