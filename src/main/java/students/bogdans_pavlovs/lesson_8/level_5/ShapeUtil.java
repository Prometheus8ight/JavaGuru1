package students.bogdans_pavlovs.lesson_8.level_5;

import java.util.Random;

class ShapeUtil {


    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    double calculateTotalArea(Shape[] shapes){

        double areaSum = 0;
        for (Shape shape : shapes){

            areaSum = areaSum + shape.calculateArea();

        }

        return areaSum;
    }

    double calculateTotalPerimeter(Shape[] shapes){

        double perimeterSum = 0;
        for (Shape shape : shapes){

            perimeterSum = perimeterSum + shape.calculatePerimeter();

        }

        return perimeterSum;
    }



    Shape createRandomShape() { //Этот метод создаёт случайную геометрическую фигуру.
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


    Circle createRandomCircle(){ //Этот метод создаёт круг со случайным радиусом.
        Random random = new Random();
        return new Circle(random.nextDouble());

    }

    Square createRandomSquare(){ //Этот метод создаёт квадрат со случайно выбранной длиной стороны.
        Random random = new Random();
        return new Square(random.nextDouble());

    }

    Rectangle createRandomRectangle(){ //Этот метод создаёт прямоугольник со случайно выбранными сторонами.
        Random random = new Random();
        return new Rectangle(random.nextDouble(), random.nextDouble());
    }

    Triangle createRandomTriangle(){ //Этот метод создаёт равносторонний треугольник со случайно выбранной длиной стороны.
        Random random = new Random();
        return new Triangle(random.nextDouble(), random.nextDouble(), random.nextDouble());
    }


}
