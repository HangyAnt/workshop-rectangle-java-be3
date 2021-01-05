package com.codecool.rectangle;

public class Rectangle {

    private int height;
    private int width;
    private int size;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    Rectangle(int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    int calculateArea() {
        return this.height * this.width;
    }

    int getHeight() {
        return this.height;
    }

    int getWidth() {
        return this.width;
    }

}
