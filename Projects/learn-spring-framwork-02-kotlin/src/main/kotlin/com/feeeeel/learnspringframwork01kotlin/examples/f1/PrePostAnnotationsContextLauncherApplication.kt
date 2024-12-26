package com.feeeeel.learnspringframwork01kotlin.examples.f1

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.*

@Component
class SomeClass(private val someDependency: SomeDependency) {
    init {
        println("All dependencies are ready!")
    }

    @PostConstruct
    fun initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    fun cleanup() {
        println("Clean up")
    }
}

@Component
class SomeDependency {
    fun getReady() {
        println("some logic using SomeDependency")
    }
}

@Configuration
@ComponentScan
class PrePostAnnotationsContextLauncherApplication {}


fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)
    }
}