package com.feeeeel.learnspringframwork01kotlin.game

class GameRunner(private var game: GamingConsole) {
    fun run() {
        println("Running Game: $game")
        game.up()
        game.down()
        game.left()
        game.right()
    }
}