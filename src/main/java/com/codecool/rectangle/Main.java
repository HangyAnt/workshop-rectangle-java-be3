package com.codecool.rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 8);
        System.out.println("Rectangle1 height: " + rectangle1.getHeight());
        System.out.println("Rectangle1 width: " + rectangle1.getWidth());
        System.out.println("Rectangle1 area: " + rectangle1.calculateArea());
        Rectangle rectangle2 = new Rectangle(4, 3, 12);
        System.out.println("Rectangle2 height: " + rectangle2.getHeight());
        System.out.println("Rectangle2 width: " + rectangle2.getWidth());
        System.out.println("Rectangle2 area: " + rectangle2.calculateArea());
    }

}
