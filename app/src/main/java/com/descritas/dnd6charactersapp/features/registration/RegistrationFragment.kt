package com.descritas.dnd6charactersapp.features.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.descritas.dnd6charactersapp.R
import com.descritas.dnd6charactersapp.core.ui.BaseFragment
import com.descritas.dnd6charactersapp.data.AuthResult
import com.descritas.dnd6charactersapp.databinding.FragmentRegistrationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : BaseFragment<FragmentRegistrationBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?) -> FragmentRegistrationBinding =
        { inflater, container ->
            FragmentRegistrationBinding.inflate(inflater, container, false)

        }
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputList = listOf(
            binding.signUpEmail,
            binding.signUpPasswordLayout
        )

        viewModel.authState.observe(viewLifecycleOwner) {
            when (it) {
                AuthResult.Loading -> binding.progressBarRegistration.visibility = View.VISIBLE
                is AuthResult.Error -> {
                    binding.progressBarRegistration.visibility = View.GONE
                    Toast.makeText(requireContext(), it.e.message.toString(), Toast.LENGTH_LONG)
                        .show()
                }

                is AuthResult.Success -> {
                    findNavController().navigate(R.id.action_registrationFragment_to_homeFragment)
                }
            }
        }

        binding.startSignUp.setOnClickListener {
            val allValidation = inputList.map { it.isValid() }
            if (allValidation.all { it }) {
                viewModel.sendCredentials(
                    email = binding.signUpEmail.text(),
                    password = binding.signUpPasswordLayout.text()
                )
            }
        }
    }
}
