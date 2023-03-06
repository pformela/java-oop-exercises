public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setLength(float newLength) {
        this.length = newLength;
    }

    public void setWidth(float newWidth) {
        this.width = newWidth;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}
