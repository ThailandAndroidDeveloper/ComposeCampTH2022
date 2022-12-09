package com.codelabs.state.step10

import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {

    // TODO: step10 waterCount State

    // region list

    // TODO: step10 tasks: List<WellnessTask>>

    fun removeTask(taskId: TaskId) {
        // TODO: impl
    }

    fun setTaskChecked(taskId: TaskId, checked: Boolean) {
        // TODO: impl
    }

    private fun getWellnessTasks() = List(30) { i -> WellnessTask(i.toLong(), "Task # $i", checked = false) }
    // endregion
}

