package students.andrew_galashin.lesson_8.level_5.task_25;


import java.util.Random;

public class ShapeUtil {

    double calculateArea(Shape[] shapes) {
        double x = 0;
        for (Shape shape : shapes) {
            shape.calculateArea();
            x = x + shape.calculateArea();
        }
        return x;
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

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextInt(20));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextInt(20));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        double x = random.nextInt(20);
        double y = random.nextInt(10);
        return new Rectangle("Rectangle", x, y);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double a = random.nextInt(20);
        double h = random.nextInt(10);
        return new Triangle("Triangle", a, h);
    }
}
