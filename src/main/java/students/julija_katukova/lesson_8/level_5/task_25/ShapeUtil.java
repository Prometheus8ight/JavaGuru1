package students.julija_katukova.lesson_8.level_5.task_25;

import java.util.Random;

class ShapeUtil {

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            shape.calculateArea();
            area += shape.calculateArea();
        }
        return area;
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
        return new Circle("circle", random.nextInt(10)); // chose next int to add bound to simplify calculations
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("square", random.nextInt(10));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("rectangle", random.nextInt(10), random.nextInt(10));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideA = random.nextInt(10);
        return new Triangle("triangle", sideA, sideA, sideA);
    }
}
