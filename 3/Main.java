package com.company;

public class Main {
    public static void main(String[] args) {
        Movable rec = new MovableRectangle(2,0,0,1,1,1);
        rec.moveUp();
        rec.moveRight();
        System.out.println(rec.toString());
    }
}
