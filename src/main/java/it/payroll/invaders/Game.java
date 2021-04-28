package it.payroll.invaders;

import it.payroll.invaders.actors.Ship;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {

    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    private GameBoard gameBoard;
    private Ship ship;

    /**
     *
     */
    public Game() {
        super();

        setTitle("Space Invaders");
        setSize(640, 480);
        setResizable(false);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ship = new Ship(10, 10, 20, 20);
        gameBoard = new GameBoard(ship);
        gameBoard.setPreferredSize(new Dimension(640, 480));

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(gameBoard, BorderLayout.CENTER);

        pack();
        setVisible(true);
        requestFocus();
    }

    private void quit() {
        System.exit(0);
    }

    private void move_left() {
        logger.debug("Move left");
        int saveX = ship.x;
        ship.x -= 10;

        gameBoard.repaint(saveX, ship.y, ship.w, ship.h);
        gameBoard.repaint(ship.x, ship.y, ship.w, ship.h);
    }

    private void move_right() {
        logger.debug("Move right");
        int saveX = ship.x;
        ship.x += 10;

        gameBoard.repaint(saveX, ship.y, ship.w, ship.h);
        gameBoard.repaint(ship.x, ship.y, ship.w, ship.h);

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
                requestFocus();
                break;
            case KeyEvent.VK_Q:
                quit();
                break;
            case KeyEvent.VK_LEFT:
                move_left();
                requestFocus();
                break;
            case KeyEvent.VK_RIGHT:
                move_right();
                requestFocus();
                break;
            case KeyEvent.VK_SPACE:
                fire();
                requestFocus();
                break;
        }
    }


    // == MAIN ========================================================================================================

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game();
            }
        });
    }
}
