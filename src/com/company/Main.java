package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 1, 10, 5);
        MovableCircle movableCircle = new MovableCircle(2, 2, 3, 3, 6);
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
