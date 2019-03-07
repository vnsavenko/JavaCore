package com.savenko.javacore.chapter08.override;

import com.savenko.javacore.chapter07.RecTest;

public class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area(){
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}

class Rectangle extends Figure{
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area(){
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }

}
class Triangle extends Figure{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area(){
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

class FindAreas{
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

        figref = f;
        System.out.println("Площадь равна " + figref.area());
    }
}