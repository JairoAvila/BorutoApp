package com.jairoavila.borutoapp.domain.use_cases

import com.jairoavila.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed)
    }

}