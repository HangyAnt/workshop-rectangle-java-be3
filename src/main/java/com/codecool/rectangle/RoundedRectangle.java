package com.codecool.rectangle;

public class RoundedRectangle extends Rectangle {

    private final int ROUND_RADIUS;

    RoundedRectangle(int height, int width, int roundRadius) {
        super(height, width);
        this.ROUND_RADIUS = roundRadius;
    }

    int getRoundRadius() {
        return this.ROUND_RADIUS;
    }

    @Override
    double calculateArea() {
        return super.calculateArea() - (4 * (ROUND_RADIUS * ROUND_RADIUS)) + (ROUND_RADIUS * ROUND_RADIUS * Math.PI);
    }

}
