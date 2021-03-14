package students.alex_kalashnikov.lesson_8.level_4.task_17;

public class Square extends Shape {

    private double sideLength;

    public Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }
}