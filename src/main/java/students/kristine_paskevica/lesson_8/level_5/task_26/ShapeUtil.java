package students.kristine_paskevica.lesson_8.level_5.task_26;

import java.util.Random;

class ShapeUtil {

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
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

    Triangle createRandomTriangle() {
        Random random = new Random();
        double trijstMala = random.nextInt(7);
        return new Triangle("triangle", trijstMala);
    }

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("circle", random.nextInt(6));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("square", random.nextInt(8));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("rectangle", random.nextInt(8), random.nextInt(8));
    }
}
