package com.descritas.dnd6charactersapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.descritas.dnd6charactersapp.repository.CharacterRepository
import com.descritas.dnd6charactersapp.repository.CharacterRepositoryImpl

class CharacterViewModel(application: Application): AndroidViewModel(application) {
    private val repository: CharacterRepository = CharacterRepositoryImpl()

}