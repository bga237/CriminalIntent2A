package com.example.criminalintenta

import java.util.*
import java.util.Date

data class Crime (
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)