package students.alex_kalashnikov.lesson_8.level_4.task_19;

public class Triangle extends Shape {

    private double sideLength;

    public Triangle(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return (sideLength * sideLength) / 2;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }
}