package com.feeeeel.learnspringframwork01kotlin.examples.a1

import com.feeeeel.learnspringframwork01kotlin.examples.d1.LazyInitializationContextLauncherApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.*

@Component
class YourBusinessClass(
    private var dependency1: Dependency1,
    private var dependency2: Dependency2
) {

    init {
        println("Constructor Injection - YourBusinessClass")
    }

//    @Autowired
//    fun setDependency1(dependency1: Dependency1) {
//        println("Setter Injection - setDependency1")
//        this.dependency1 = dependency1
//    }
//
//    @Autowired
//    fun setDependency2(dependency2: Dependency2) {
//        println("Setter Injection - setDependency2")
//        this.dependency2 = dependency2
//    }

    override fun toString(): String {
        return "Using $dependency1 and $dependency2";
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
class DepInjectionLauncherApplication {}

fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(DepInjectionLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)
        println(context.getBean(YourBusinessClass::class.java))
    }
}