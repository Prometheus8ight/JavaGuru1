package students.alex_kalashnikov.lesson_8.level_5.task_28;

class Rectangle extends Shape {

    protected double side1Length;
    protected double side2Length;

    public Rectangle(double side1Length, double side2Length) {
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