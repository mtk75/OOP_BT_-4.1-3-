public class Circle {
    private double radius = 1.0;
    String color = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";

    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[raidus=" + radius + ",color=" + color + "]";
    }
}