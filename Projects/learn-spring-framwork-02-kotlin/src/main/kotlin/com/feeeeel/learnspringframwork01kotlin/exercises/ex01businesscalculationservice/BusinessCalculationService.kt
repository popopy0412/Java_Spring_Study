package com.feeeeel.learnspringframwork01kotlin.exercises.ex01businesscalculationservice

import org.springframework.stereotype.Component

@Component
class BusinessCalculationService(private val dataService: DataService) {
    fun findMax(): Int = dataService.retrieveData().maxOrNull() ?: 0
}