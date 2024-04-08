//Interface
package Practical;

// Define the Shape interface
interface Shape {
    double calculateArea();
    double calculateParameter();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateParameter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateParameter() {
        return 2 * (length + width);
    }
}

// Demonstrate the use of the Shape interface, Circle, and Rectangle classes
class ShapeDemo {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(2.0, 5.0);

        // Display information about the Circle
        System.out.println("Circle - Radius: " + circle.calculateParameter() +
                ", Area: " + circle.calculateArea());

        // Display information about the Rectangle
        System.out.println("Rectangle - Length: " + rectangle.calculateParameter() +
                ", Area: " + rectangle.calculateArea());
    }
}
