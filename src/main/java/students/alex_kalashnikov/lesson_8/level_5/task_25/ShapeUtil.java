package students.alex_kalashnikov.lesson_8.level_5.task_25;

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
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += Shape.shapes[i];
        }
        return sum;
    }

}