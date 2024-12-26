package com.feeeeel.learnspringframwork01kotlin.game

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
@Qualifier("SuperContraGameQualifier")
class SuperContraGame : GamingConsole {
    override fun up() = println("Up")
    override fun down() = println("Sit down")
    override fun left() = println("Go back")
    override fun right() = println("Shoot a bullet")
}