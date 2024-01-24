package com.descritas.dnd6charactersapp.data

import com.descritas.dnd6charactersapp.domain.User

sealed class AuthResult {

    class Success(val user: User) : AuthResult()

    class Error(val e: Exception) : AuthResult()

    object Loading : AuthResult()
}