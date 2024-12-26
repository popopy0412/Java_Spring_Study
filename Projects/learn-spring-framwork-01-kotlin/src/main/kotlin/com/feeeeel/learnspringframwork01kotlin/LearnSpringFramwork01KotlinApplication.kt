package com.feeeeel.learnspringframwork01kotlin

import com.feeeeel.learnspringframwork01kotlin.game.GameRunner
import com.feeeeel.learnspringframwork01kotlin.game.MarioGame
import com.feeeeel.learnspringframwork01kotlin.game.PacmanGame
import com.feeeeel.learnspringframwork01kotlin.game.SuperContraGame
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearnSpringFramwork01KotlinApplication

fun main(args: Array<String>) {
    var game = PacmanGame()
    var gameRunner = GameRunner(game)
    gameRunner.run()
    runApplication<LearnSpringFramwork01KotlinApplication>(*args)
}
