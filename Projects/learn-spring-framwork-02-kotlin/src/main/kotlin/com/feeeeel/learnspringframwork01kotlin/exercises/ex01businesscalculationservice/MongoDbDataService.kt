package com.feeeeel.learnspringframwork01kotlin.exercises.ex01businesscalculationservice

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class MongoDbDataService: DataService {
    override fun retrieveData(): Array<Int> = arrayOf(11, 22, 33, 44, 55)
}