package it.payroll.invaders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {

    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    /**
     *
     */
    public Game() {
        setSize(640, 480);
        setVisible(true);
        addKeyListener(this);
    }

    private void quit() {
        System.exit(0);
    }

    private void move_left() {
        logger.debug("Move left");
    }

    private void move_right() {
        logger.debug("Move right");
    }

    private void fire() {
        logger.debug("Fire");
    }

    private void start_game() {
        logger.debug("Start game");
    }

    // == KEY LISTENER ================================================================================================

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_S:
                start_game();
                break;
            case KeyEvent.VK_Q:
                quit();
                break;
            case KeyEvent.VK_LEFT:
                move_left();
                break;
            case KeyEvent.VK_RIGHT:
                move_right();
                break;
            case KeyEvent.VK_SPACE:
                fire();
                break;
        }
    }

    // == MAIN ========================================================================================================

    public static void main(String[] args) {
        Game game = new Game();
    }
}
