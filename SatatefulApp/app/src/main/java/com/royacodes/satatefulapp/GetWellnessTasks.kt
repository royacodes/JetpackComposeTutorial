package com.royacodes.satatefulapp

fun getWellnessTask() = List(30) { i -> WellnessTask(id = i, label = "Task # $i") }
