package com.royacodes.satatefulapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTask() }
) {
    LazyColumn(modifier = modifier) {
        items(list) {task ->
            WellnessTaskItem(taskName = task.label)
        }
    }

}