package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight = new MovablePoint(0,0,0,0);

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.bottomRight.x1 = x1;
        this.bottomRight.y1 = y1;
        this.topLeft.x1 = x2;
        this.topLeft.y1 = y2;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public String toString() {
        return "Bottom right x: " + bottomRight.x1 + ", y: " + bottomRight.y1 +
                "\nTop left x: " + topLeft.x1 + ", y: " + topLeft.y1;
    }
}
