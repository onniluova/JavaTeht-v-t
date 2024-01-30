package src.Moduuli3.tehtava3;

public class Shape {
    int radius = 0;
    double area = Math.PI * Math.pow(radius, 2);
    public float calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    final private float radius;

    Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}

class Rectangle extends Shape {
    final private float a;
    final private float b;

    Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
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

    Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float calculateArea() {
        return (a * b * c) / 2;
    }
}

