package students.andrew_galashin.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double x;
    private double y;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double calculateArea() {
        return x * y;
    }

    @Override
    double calculatePerimeter() {
        return (x + y) * 2;
    }
}
