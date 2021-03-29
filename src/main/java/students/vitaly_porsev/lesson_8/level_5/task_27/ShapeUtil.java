package students.vitaly_porsev.lesson_8.level_5.task_27;

import java.util.Random;

public class ShapeUtil {

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

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle(random.nextInt(10) + 1 , random.nextInt(10) + 1 , random.nextInt(10) + 1);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1 );
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextInt(10) + 1);
    }

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextInt(10) + 1);
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateSumPerimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculatePerimeter();
        }
        return sum;
    }

    double calculateSumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }
}