package it.payroll.invaders;

import it.payroll.invaders.actors.Enemy;
import it.payroll.invaders.actors.Ship;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {

    /**
     * Logger instance
     */
    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    public static final int BOARD_WIDTH = 640;
    public static final int BOARD_HEIGHT = 480;

    private GameBoard gameBoard;

    /**
     *
     */
    public Game() {
        super();

        setTitle("Space Invaders");
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setResizable(false);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ship myShip = new Ship(10,10, 20, 20);
        Enemy enemy1 = new Enemy(30, 10, 20, 20);
        Enemy enemy2 = new Enemy(30, 40, 20, 20);

        gameBoard = new GameBoard(myShip, enemy1, enemy2);
        gameBoard.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(gameBoard, BorderLayout.CENTER);

        pack();
        setVisible(true);
        requestFocus();
    }

    public void start() {}

    public void quit() {
        dispose();
        System.exit(0);
    }
    // == KEYLISTENER =================================================================================================

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        logger.info("KEY PRESSED = " + e.getKeyCode());

        switch (e.getKeyCode()) {
            case KeyEvent.VK_Q:
                quit();
                break;
            case KeyEvent.VK_LEFT:
                this.gameBoard.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                this.gameBoard.moveRight();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

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
