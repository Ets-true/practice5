package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(6, 9, 25, 13);
        MovableCircle movableCircle = new MovableCircle(23, 34, 10, 2, 9);
        System.out.println(movablePoint);
        System.out.println(movableCircle);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movablePoint);
        System.out.println(movableCircle);
    }
}
