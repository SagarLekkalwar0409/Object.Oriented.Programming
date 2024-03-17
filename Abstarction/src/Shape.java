// Abstract class Shape representing a geometric shape
abstract class Shape {
    private String color; // Color of the shape

    // Constructor to initialize the color
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate the area of the shape
    public abstract double area();

    // Abstract method to calculate the perimeter of the shape
    public abstract double perimeter();

    // Getter method to retrieve the color of the shape
    public String getColor() {
        return color;
    }
}

// Concrete class Circle representing a circle shape
class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor to initialize the color and radius of the circle
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class Rectangle representing a rectangle shape
class Rectangle extends Shape {
    private double length; // Length of the rectangle
    private double width; // Width of the rectangle

    // Constructor to initialize the color, length, and width of the rectangle
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class to demonstrate the usage of the Shape, Circle, and Rectangle classes
class Abstraction1 {
    public static void main(String[] args) {
        // Create a Circle object with color "Red" and radius 5.0
        Shape circle = new Circle("Red", 5.0);
        // Create a Rectangle object with color "Blue", length 4.0, and width 6.0
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Print the area, perimeter, and color of the circle
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Perimeter: " + circle.perimeter());
        System.out.println("Circle Color: " + circle.getColor());

        // Print the area, perimeter, and color of the rectangle
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Color: " + rectangle.getColor());
    }
}
