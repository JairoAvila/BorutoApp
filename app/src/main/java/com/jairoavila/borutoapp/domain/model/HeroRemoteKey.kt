package com.jairoavila.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val prevPage: Int?,
    val nextPage: Int?,
    val lastUpdated: Long?
)
