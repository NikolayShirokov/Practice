package com.company;

public class MovablePoint implements Movable {
    public int x1, y1, xSpeed, ySpeed;

    MovablePoint(int x1, int y1, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y1 += ySpeed;
    }

    @Override
    public void moveDown() {
        y1 -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x1 -= xSpeed;
    }

    @Override
    public void moveRight() {
        x1 += xSpeed;
    }
}
