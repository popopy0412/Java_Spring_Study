package com.feeeeel.learnspringframwork01kotlin.game

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class GameRunner(@Qualifier("SuperContraGameQualifier") private var game: GamingConsole) {
    fun run() {
        println("Running Game: $game")
        game.up()
        game.down()
        game.left()
        game.right()
    }
}