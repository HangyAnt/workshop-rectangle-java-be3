package com.codecool.rectangle;

public class Rectangle {

    private final int HEIGHT;
    private final int WIDTH;
    private int size;

    Rectangle(int height, int width) {
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    Rectangle(int height, int width, int size) {
        this.HEIGHT = height;
        this.WIDTH = width;
        this.size = size;
    }

    double calculateArea() {
        return this.HEIGHT * this.WIDTH;
    }

    void printRectangle() {
        System.out.print("Height of Rectangle: " + this.HEIGHT + ", ");
        System.out.println("Width of Rectangle: " + this.WIDTH);
    }

    int getHeight() {
        return this.HEIGHT;
    }

    int getWidth() {
        return this.WIDTH;
    }

}
