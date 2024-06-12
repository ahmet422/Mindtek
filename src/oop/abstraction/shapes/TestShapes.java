package oop.abstraction.shapes;

public class TestShapes {

    public static void main(String[] args) {

        // Abstract class can NOT be instantiated (create object)
        // Shape shape=new Shape();

        Square square=new Square();
        square.length=5;
        square.width=5;

        Circle circle=new Circle();
        circle.radius=8;

        Triangle triangle=new Triangle();
        triangle.length=4;
        triangle.length2=6;
        triangle.width=5;

        System.out.println("Area of square: "+square.getArea());
        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Area of triangle: "+triangle.getArea());

    }

}
