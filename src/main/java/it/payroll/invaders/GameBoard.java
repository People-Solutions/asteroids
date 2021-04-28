package it.payroll.invaders;

import it.payroll.invaders.actors.Ship;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {

    private Ship ship;

    public GameBoard(Ship ship) {
        this.ship = ship;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        ship.paint(g);
    }
}
