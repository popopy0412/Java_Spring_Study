package com.feeeeel.learnspringframwork01kotlin.examples.d1

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component
import java.util.*

@Component
class ClassA {}

@Component
@Lazy
class ClassB(private var classA: ClassA) {
    init {
        println("Some Initialization logic")
    }

    fun doSomething() {
        println("Do Something")
    }
}

@Configuration
@ComponentScan
class LazyInitializationContextLauncherApplication {}


fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(LazyInitializationContextLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)

        println("Initialization of context is completed")

        context.getBean(ClassB::class.java).doSomething()
    }
}