package com.feeeeel.learnspringframwork01kotlin.game

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.feeeeel.learnspringframwork01kotlin.game")
class GamingAppLauncherApplication {
//    @Bean
//    fun game(): GamingConsole {
//        val game = PacmanGame()
//        return game
//    }

//    @Bean
//    fun gameRunner(game: GamingConsole): GameRunner {
//        println("Parameter: $game")
//        val gameRunner = GameRunner(game)
//        return gameRunner
//    }
}


fun main(args: Array<String>) {
    AnnotationConfigApplicationContext(GamingAppLauncherApplication::class.java).use { context ->
        context.getBean(GamingConsole::class.java).up()
        context.getBean(GameRunner::class.java).run()
    }
}