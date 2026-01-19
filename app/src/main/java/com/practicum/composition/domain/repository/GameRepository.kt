package com.practicum.composition.domain.repository

import com.practicum.composition.domain.entity.GameSettings
import com.practicum.composition.domain.entity.Level
import com.practicum.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}