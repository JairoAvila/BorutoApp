package com.jairoavila.borutoapp.presentation.screens.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jairoavila.borutoapp.domain.model.Hero
import com.jairoavila.borutoapp.domain.use_cases.UseCases
import com.jairoavila.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val useCases: UseCases,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _selectedHero: MutableState<Hero?> = mutableStateOf(null)
    val selectedHero: State<Hero?> = _selectedHero

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val heroId = savedStateHandle.get<Int>(DETAILS_ARGUMENT_KEY)
            _selectedHero.value =
                heroId?.let { useCases.getSelectedHeroUseCase(heroId = heroId) }
        }
    }
}