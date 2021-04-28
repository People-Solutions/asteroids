package it.payroll.invaders.actors;

import java.awt.*;

public class Ship {

    public int x;
    public int y;
    public int w;
    public int h;
    private Color color = Color.RED;

    public  Ship(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);

    }

}
