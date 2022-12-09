package com.codelabs.state.step10

typealias TaskId = Long

data class WellnessTask(
    val id: TaskId,
    val label: String,
    val checked: Boolean,
)