public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle(10.0);
    System.out.println("Circle: ");
    System.out.println(circle.getRadius());
    System.out.println(circle.getArea());
    System.out.println(circle.getPerimeter());
    System.out.println();

    Sphere sphere = new Sphere(10.0);
    System.out.println("Sphere: ");
    System.out.println(sphere.getRadius());
    System.out.println(sphere.getCircumference());
    System.out.println(sphere.getVolume());
    System.out.println(sphere.getSurfaceArea());
    System.out.println();

    Matrix matrix = new Matrix(3, 3);
    System.out.println("Matrix: ");
    System.out.println(matrix);
    Matrix matrix2 = new Matrix(3, 3);
    System.out.println("Matrix2: ");
    System.out.println(matrix2);
    matrix.transpose();
    System.out.println("Transpose: ");
    System.out.println(matrix);
    System.out.println("Spiral: ");
    matrix.printSpiral();
    System.out.println();
    System.out.println("Multiply: ");
    matrix.multiply(matrix2);
    System.out.println(matrix);

    }
}
