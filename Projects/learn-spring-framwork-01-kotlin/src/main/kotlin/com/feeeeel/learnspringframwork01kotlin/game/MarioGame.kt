package com.feeeeel.learnspringframwork01kotlin.game

class MarioGame : GamingConsole {
    override fun up() = println("Jump")
    override fun down() = println("Go into a hole")
    override fun left() = println("Go back")
    override fun right() = println("Accelerate")
}