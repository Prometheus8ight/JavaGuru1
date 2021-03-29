package students.rodion_afanasjev.lesson_8.level_5.task_20;

import java.util.Random;

class ShapeUtil {

    Random rand = new Random();

    Circle createRandomCircle() {
        return new Circle("Circle", rand.nextInt(10));
    }

    Square createRandomSquare(){
        return new Square("Square", rand.nextInt(10));
    }

    Rectangle createRandomRectangle(){
        return new Rectangle("Rectangle", rand.nextInt(10), rand.nextInt(10));
    }

    Triangle createRandomTriangle(){
        return new Triangle("Triangle", rand.nextInt(10));
    }

    Shape createRandomShape() {
        int randomNumber = rand.nextInt(4);
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

    double calculateArea(Shape[] shapes){
        double area = 0;
        for (Shape shape : shapes){ // тип данных, имя, массив.
            shape.calculateArea();
            area = shape.calculateArea() + area;
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes){
        double perimeter = 0;
        for (Shape shape : shapes){ // тип данных, имя, массив.
            shape.calculatePerimeter();
            perimeter = shape.calculatePerimeter() + perimeter;
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
