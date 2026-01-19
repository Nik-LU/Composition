package com.practicum.composition.domain.usecases

import com.practicum.composition.domain.entity.GameSettings
import com.practicum.composition.domain.entity.Level
import com.practicum.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}