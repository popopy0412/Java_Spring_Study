package com.feeeeel.learnspringframwork01kotlin

import com.feeeeel.learnspringframwork01kotlin.game.GameRunner
import com.feeeeel.learnspringframwork01kotlin.game.GamingConsole
import com.feeeeel.learnspringframwork01kotlin.game.PacmanGame
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GamingConfiguration {
    @Bean
    fun game(): GamingConsole {
        val game = PacmanGame()
        return game
    }

    @Bean
    fun gameRunner(game: GamingConsole): GameRunner {
        val gameRunner = GameRunner(game)
        return gameRunner
    }
}