package com.geometry;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.getType());
        System.out.println("Площадь: " + circle.getSquare());
        System.out.println("Периметр: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(4, 7);
        System.out.println(rectangle.getType());
        System.out.println("Площадь: " + rectangle.getSquare());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(6);
        System.out.println(triangle.getType());
        System.out.println("Площадь: " + triangle.getSquare());
        System.out.println("Периметр: " + triangle.getPerimeter());

        System.out.println(GeometryUtils.getCommonSquare(circle, rectangle));
        System.out.println(GeometryUtils.getCommonPerimeter(circle, rectangle));

        ThreeDimensionalShape cube = new Cube(5);
        System.out.println(cube.getType());
        System.out.println("Объём: " + cube.getVolume());
    }
}