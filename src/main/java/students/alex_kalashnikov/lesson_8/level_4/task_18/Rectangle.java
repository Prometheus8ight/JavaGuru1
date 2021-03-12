package students.alex_kalashnikov.lesson_8.level_4.task_18;

public class Rectangle extends Shape {

    private double side1Length;
    private double side2Length;

    public Rectangle(String title, double side1Length, double side2Length) {
        super(title);
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    @Override
    double calculateArea() {
        return side1Length * side2Length;
    }

    @Override
    double calculatePerimeter() {
        return (side1Length + side2Length) * 2;
    }

}