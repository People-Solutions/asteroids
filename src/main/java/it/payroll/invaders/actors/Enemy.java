package it.payroll.invaders.actors;

import java.awt.*;

public class Enemy extends AbstractSprite {

    public Enemy(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

}
