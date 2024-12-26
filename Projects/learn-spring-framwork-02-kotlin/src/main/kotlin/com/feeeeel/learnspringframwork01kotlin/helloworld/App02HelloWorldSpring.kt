package com.feeeeel.learnspringframwork01kotlin.helloworld

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.*

class App02HelloWorldSpring {}

fun main() {
    AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java).use { context ->
        println(context.getBean("name"))
        println(context.getBean("age"))
        println(context.getBean("person"))
        println(context.getBean("person2MethodCall"))
        println(context.getBean("person3Parameters"))
        println(context.getBean("address2"))
        println(context.getBean("address3"))
        println(context.getBean(Person::class.java))
        println(context.getBean(Address::class.java))
        Arrays.stream(context.beanDefinitionNames).forEach(::println)
    }
}