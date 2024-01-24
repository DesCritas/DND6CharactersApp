package com.descritas.dnd6charactersapp.domain

import com.descritas.dnd6charactersapp.data.AuthResult

interface AuthRepository {

    suspend fun signInWithEmailAndPassword(email: String, password: String): AuthResult

    suspend fun signUpWithEmailAndPassword(email: String, password: String): AuthResult
}