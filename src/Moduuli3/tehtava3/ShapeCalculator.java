package src.Moduuli3.tehtava3;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5, "Green");
        Rectangle rectangle = new Rectangle(4, 6, "Blue");
        Triangle triangle = new Triangle(3, 8, 12, "Yellow");

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for(Shape s : shapes){
            System.out.println(s.getColor());
            System.out.println(s.calculateArea());
        }
    }
}
