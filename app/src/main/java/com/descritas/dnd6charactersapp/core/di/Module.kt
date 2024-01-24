package com.descritas.dnd6charactersapp.core.di

import com.descritas.dnd6charactersapp.data.AuthRepositoryImpl
import com.descritas.dnd6charactersapp.domain.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class Module {

    @Binds
    abstract fun bindAuthRepository(authRepositoryImpl: AuthRepositoryImpl): AuthRepository
}