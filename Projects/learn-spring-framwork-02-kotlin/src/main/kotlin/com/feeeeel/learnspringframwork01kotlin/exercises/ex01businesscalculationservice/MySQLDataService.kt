package com.feeeeel.learnspringframwork01kotlin.exercises.ex01businesscalculationservice

class MySQLDataService: DataService {
    override fun retrieveData(): Array<Int> = arrayOf(1, 2, 3, 4, 5)
}