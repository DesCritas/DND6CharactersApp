package com.descritas.dnd6charactersapp.data

import com.descritas.dnd6charactersapp.domain.AuthRepository
import com.descritas.dnd6charactersapp.domain.User
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val auth: FirebaseAuth) : AuthRepository {

    override suspend fun signInWithEmailAndPassword(email: String, password: String): AuthResult {
        return try {
            val user = auth.signInWithEmailAndPassword(email, password).await().user!!
            AuthResult.Success(User.Base(user.email ?: " ", user.uid))
        } catch (e: Exception) {
            AuthResult.Error(e)
        }
    }

    override suspend fun signUpWithEmailAndPassword(email: String, password: String): AuthResult {
        return try {
            val user = auth.createUserWithEmailAndPassword(email, password).await().user!!
            AuthResult.Success(User.Base(user.email ?: " ", user.uid))
        } catch (e: Exception) {
            AuthResult.Error(e)
        }
    }
}