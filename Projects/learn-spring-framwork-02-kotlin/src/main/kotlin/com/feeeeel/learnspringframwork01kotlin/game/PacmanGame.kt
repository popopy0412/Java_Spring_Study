package com.feeeeel.learnspringframwork01kotlin.game

import org.springframework.stereotype.Component

@Component
class PacmanGame : GamingConsole {
    override fun up() = println("Up")
    override fun down() = println("Down")
    override fun left() = println("Left")
    override fun right() = println("Right")
}