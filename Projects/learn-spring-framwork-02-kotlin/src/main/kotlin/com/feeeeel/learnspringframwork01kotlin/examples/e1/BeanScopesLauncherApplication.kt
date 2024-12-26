package com.feeeeel.learnspringframwork01kotlin.examples.e1

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.*

// 기본적으로 싱글톤 인스턴스, 여러번 호출해도 같은 객체가 호출
@Component
class NormalClass {}

// 호출할 때마다 Bean의 새로운 인스턴스가 생성
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {}

@Configuration
@ComponentScan
class BeanScopesLauncherApplication {}

fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(BeanScopesLauncherApplication::class.java).use { context ->
        Arrays.stream(context.beanDefinitionNames).forEach(::println)

        println(context.getBean(NormalClass::class.java))
        println(context.getBean(NormalClass::class.java))

        println(context.getBean(PrototypeClass::class.java))
        println(context.getBean(PrototypeClass::class.java))
        println(context.getBean(PrototypeClass::class.java))
    }
}