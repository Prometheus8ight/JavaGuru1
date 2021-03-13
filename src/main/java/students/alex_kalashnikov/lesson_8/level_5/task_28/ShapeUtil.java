package students.alex_kalashnikov.lesson_8.level_5.task_28;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle(Math.random() * 10);
    }

    Square createRandomSquare() {
        return new Square(Math.random() * 10);
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(Math.random() * 10, Math.random() * 10);
    }

    Triangle createRandomTriangle() {
        return new Triangle(Math.random() * 10);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double circle = calculateArea(shapes[0]);
        double square = calculateArea(shapes[1]);
        double rectangle = calculateArea(shapes[2]);
        double triangle = calculateArea(shapes[3]);
        return circle + square + rectangle + triangle;
    }

    double calculatePerimeter(Shape[] shapes) {
        double circle = calculatePerimeter(shapes[0]);
        double square = calculatePerimeter(shapes[1]);
        double rectangle = calculatePerimeter(shapes[2]);
        double triangle = calculatePerimeter(shapes[3]);
        return circle + square + rectangle + triangle;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}