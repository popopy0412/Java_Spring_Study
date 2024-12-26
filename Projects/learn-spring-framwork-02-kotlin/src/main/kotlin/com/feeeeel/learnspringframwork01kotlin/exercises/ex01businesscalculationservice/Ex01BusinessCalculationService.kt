package com.feeeeel.learnspringframwork01kotlin.exercises.ex01businesscalculationservice

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
class Ex01BusinessCalculationService {
}

fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(Ex01BusinessCalculationService::class.java).use { context ->
        context.beanDefinitionNames.forEach { name -> println(name) }
        val result = context.getBean(BusinessCalculationService::class.java).findMax()
        println(result)
    }
}