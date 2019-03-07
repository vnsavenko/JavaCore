package com.savenko.javacore.chapter08.abstrac;

abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}

class Rectangle extends Figure{


    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("В области четырехугольника");
        return dim1 * dim2;

    }
}

class Triangle extends Figure{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2;
    }
}

class AbstractAreas{
    public static void main(String[] args) {
       // Figure figure = new Figure(10, 10); недопустимо
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(5, 5);
        Figure figref;

        figref = rectangle;
        System.out.println("Площадь равна: " + figref.area());

        figref = triangle;
        System.out.println("Площадь равна: " + figref.area());
    }
}