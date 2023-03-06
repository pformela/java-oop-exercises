/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() {  // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) {  // 2nd constructor
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void setColor(String c) {
        this.color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + ", color= " + this.color + "]";
    }
}