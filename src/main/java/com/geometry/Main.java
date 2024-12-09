package com.geometry;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println("Круг:");
        System.out.println("Площадь: " + circle.getSquare());
        System.out.println("Периметр: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Прямоугольник:");
        System.out.println("Площадь: " + rectangle.getSquare());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(6);
        System.out.println("Круг:");
        System.out.println("Площадь: " + triangle.getSquare());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}