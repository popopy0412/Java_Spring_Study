package com.feeeeel.learnspringframwork01kotlin.examples.g1

import jakarta.inject.Inject
import jakarta.inject.Named
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.*

//@Component
@Named
class BusinessService(@Autowired(required = false) private var dataService: DataService) {

    fun getDataService(): DataService = dataService

//    @Autowired
    @Inject
    fun setDataService(dataService: DataService) {
        println("Setter Injection")
        this.dataService = dataService;
    }
}

@Component
class DataService {}

@Configuration
@ComponentScan
class CdiContextLauncherApplication {}


fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(CdiContextLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)
        println(context.getBean(BusinessService::class.java).getDataService())
    }
}