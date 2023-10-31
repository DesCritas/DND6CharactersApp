package com.descritas.dnd6charactersapp.dto

data class FeatureCard (
    val skillType: String,
    val featureName: String,
    val featureType: String,
    val castTime: String,
    val consumptions: String,
    val duration: String,
    val components: String,
    val descriptionText: String,
    val castRequirements: String,
    val checkDifficulty: String
)