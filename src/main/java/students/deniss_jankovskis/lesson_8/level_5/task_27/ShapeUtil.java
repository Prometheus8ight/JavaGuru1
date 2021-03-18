package students.deniss_jankovskis.lesson_8.level_5.task_27;

import java.util.Random;

class ShapeUtil {

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;

    }

    double calculatePerimeter(Shape[] shapes) {
            double perimeter = 0;
            for (Shape shape : shapes) {
                perimeter += shape.calculatePerimeter();
            }
            return perimeter;
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
        return new Circle("Circle", random.nextInt(100));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Square", random.nextInt(100));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Rectangle", random.nextInt(100), random.nextInt(50));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Triangle", random.nextInt(100), random.nextInt(100),
                random.nextInt(100));
    }


}

