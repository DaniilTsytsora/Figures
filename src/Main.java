import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Form {
    abstract double getArea();
    abstract double getPerimeter();
}

class Square extends Form {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side*side;
    }

    @Override
    double getPerimeter(){
        return 4*side;
    }
}

class Rectangle extends Form {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    @Override
    double getArea() {
        return length*length;
    }
    @Override
    double getPerimeter() {
        return 2*(length+width);
    }
}

class Circle extends Form {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }
}

class Triangle extends Form {
    private double side1, side2, side3;

    public Triangle (double side1, double side2, double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    double getArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    double getPerimeter() {
        return side1+side2+side3;
    }

}





public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину стороны квадрата: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.print("Введите длину прямоугольника: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

        System.out.print("Введите радиус круга: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.print("Введите длину первой стороны треугольниа: ");
        double triangleSide1 = scanner.nextDouble();
        System.out.print("Введите длину второй стороны треугольниа: ");
        double triangleSide2 = scanner.nextDouble();
        System.out.print("Введите длину третьей стороны треугольниа: ");
        double triangleSide3 = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);

        System.out.println("Площадь квадрата: " + square.getArea()+ "\nПериметр квадрата: " + square.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea() + "\nПериметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea() + "\nПериметр круга: " + circle.getPerimeter());
        System.out.println("Площаль треугольника: " + triangle.getArea() + "\nПериметр треугольника: " + triangle.getPerimeter());

        scanner.close();
        }

    }
