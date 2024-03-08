import Circle.Circle;
import Rectangle.Rectangle;
import Square.Square;
import Triangle.Triangle;


import java.util.Scanner;


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
