public class Circle {

    //the radius should not be modified once a circle object is created
    private final double radius;

    //all the methods are public, since information about a circle should be accessible
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
