package oop.abstraction.shapes;

public class Triangle extends Shape {

    int length2;

    @Override
    public int getPerimeter() {
        return length+width+length2;
    }

    @Override
    public int getArea() {
        return length*width/2;
    }
}
