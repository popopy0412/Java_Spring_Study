package com.feeeeel.learnspringframwork01kotlin.game

class SuperContraGame : GamingConsole {
    override fun up() = println("Up")
    override fun down() = println("Sit down")
    override fun left() = println("Go back")
    override fun right() = println("Shoot a bullet")
}