package com.feeeeel.learnspringframwork01kotlin.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

data class Person(val name: String, val age: Int, val address: Address)
data class Address(val firstLine: String, val city: String)

@Configuration
class HelloWorldConfiguration {

    @Bean
    fun name(): String = "Feeeeel"

    @Bean
    fun age(): Int = 25

    @Bean
    fun person(): Person = Person("Feeeeel", 25, Address("Nowon", "Seoul"))

    @Bean
    fun person2MethodCall(): Person = Person(name(), age(), address())

    @Bean
    fun person3Parameters(name: String, age: Int, address3: Address): Person = Person(name, age, address3)

    @Bean
    @Primary
    fun person4Parameters(name: String, age: Int, address: Address): Person = Person(name, age, address)

    @Bean(name = ["address2"])
    @Primary
    fun address(): Address = Address("Nowon", "Seoul")

    @Bean(name = ["address3"])
    fun address3(): Address = Address("Shibuya", "Tokyo")

}