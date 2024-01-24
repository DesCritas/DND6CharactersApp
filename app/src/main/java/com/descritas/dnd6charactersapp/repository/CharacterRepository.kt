package com.descritas.dnd6charactersapp.repository

import com.descritas.dnd6charactersapp.dto.PlayersCharacter

interface CharacterRepository {
    suspend fun getCharacter(): PlayersCharacter
}