package com.codelabs.state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codelabs.state.step10.WellnessTasksList
import com.codelabs.state.step10.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = viewModel(),
) {
    Column(modifier = modifier) {
        StatelessCounter(
            count = viewModel.waterCount.collectAsState().value,
            onIncrement = viewModel::increaseWaterCount,
        )
        WellnessTasksList(
            list = viewModel.tasks.collectAsState().value,
            onCloseTask = viewModel::removeTask,
            onCheckedChange = viewModel::setTaskChecked,
        )
    }
}
