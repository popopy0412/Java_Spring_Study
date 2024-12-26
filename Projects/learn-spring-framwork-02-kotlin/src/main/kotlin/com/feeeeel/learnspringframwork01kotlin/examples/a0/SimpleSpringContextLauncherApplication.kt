package com.feeeeel.learnspringframwork01kotlin.examples.a0

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ComponentScan
class SimpleSpringContextLauncherApplication {}


fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)
    }
}