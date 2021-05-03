package it.payroll.invaders.actors;

import java.awt.*;

public interface Sprite {

    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    int getHeight();

    int getWidth();

    void paint(Graphics g);

}
