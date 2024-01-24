package com.descritas.dnd6charactersapp.features.registration

import com.descritas.dnd6charactersapp.core.ui.BaseViewModel
import com.descritas.dnd6charactersapp.data.AuthResult
import com.descritas.dnd6charactersapp.domain.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(private val authRepository: AuthRepository) :
    BaseViewModel() {

    override val sendRequest: suspend (String, String) -> AuthResult =
        { email, password -> authRepository.signUpWithEmailAndPassword(email, password) }

}