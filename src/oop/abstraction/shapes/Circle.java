package oop.abstraction.shapes;

public class Circle extends Shape {

    int radius;

    @Override
    public int getPerimeter() {
        return (int)(2*3.14*radius);
    }

    @Override
    public int getArea() {
        return (int)(3.14*radius*radius);
    }

}
