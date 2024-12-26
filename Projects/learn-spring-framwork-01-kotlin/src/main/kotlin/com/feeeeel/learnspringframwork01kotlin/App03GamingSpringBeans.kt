package com.feeeeel.learnspringframwork01kotlin

import com.feeeeel.learnspringframwork01kotlin.game.GameRunner
import com.feeeeel.learnspringframwork01kotlin.game.GamingConsole
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration

class App03GamingSpringBeans {
}

fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(GamingConfiguration::class.java).use { context ->
        context.getBean(GamingConsole::class.java).up()
        context.getBean(GameRunner::class.java).run()
    }
}