package com.codecool.rectangle;

public class RoundedRectangle extends Rectangle {

    private int roundRadius;

    RoundedRectangle(int height, int width, int roundRadius) {
        super(height, width);
        this.roundRadius = roundRadius;
    }

    int getRoundRadius() {
        return this.roundRadius;
    }

    @Override
    double calculateArea() {
        return super.calculateArea() - (4 * (roundRadius * roundRadius)) + (roundRadius * roundRadius * Math.PI);
    }
}
