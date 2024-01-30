package src.Moduuli3.tehtava3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8, 12);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
