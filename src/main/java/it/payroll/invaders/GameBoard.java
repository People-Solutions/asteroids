package it.payroll.invaders;

import it.payroll.invaders.actors.Enemy;
import it.payroll.invaders.actors.Ship;
import it.payroll.invaders.actors.Sprite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GameBoard extends JPanel {
    /**
     * Logger instance
     */
    private static final Logger logger = LoggerFactory.getLogger(GameBoard.class);

    private Ship ship;
    private List<Sprite> sprites;

    public GameBoard(Ship ship, Enemy... enemies) {
        this.ship = ship;
        this.sprites = new ArrayList<>();
        this.sprites.add(ship);
        this.sprites.addAll(Arrays.asList(enemies));
    }

    public void moveLeft() {
        logger.info("Request move left");
        int x = ship.getX();
        ship.setX(x - 10);

        repaint();
    }

    public void moveRight() {
        logger.info("Request move right");
        int old_x = ship.getX();
        int new_x = old_x + 10;
        ship.setX(new_x);

        repaint(old_x, ship.getY(), ship.getWidth(), ship.getHeight());
        repaint(new_x, ship.getY(), ship.getWidth(), ship.getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);

        for(Sprite sprite: this.sprites) {
            sprite.paint(g);
        }
    }
}
