package src.Moduuli3.tehtavisto1.tehtava3;

public class Shape {
    int radius = 0;
    String color;
    double area = Math.PI * Math.pow(radius, 2);
    public float calculateArea() {
        return 0;
    }
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    final private float radius;
    String color;

    Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}

class Rectangle extends Shape {
    final private float a;
    final private float b;

    String color;

    Rectangle(float a, float b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public float calculateArea() {
        return a * b;
    }
}

class Triangle extends Shape {
    final private float a;
    final private float b;
    final private float c;

    String color;

    Triangle(float a, float b, float c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public float calculateArea() {
        return (a * b * c) / 2;
    }
}
