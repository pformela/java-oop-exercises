public class Circle2 {
    private double radius;

    public Circle2() {
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
