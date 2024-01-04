package com.feeeeel.learnspringframework;

import com.feeeeel.learnspringframework.game.GameRunner;
import com.feeeeel.learnspringframework.game.GamingConsole;
import com.feeeeel.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
