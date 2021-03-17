package students.andrew_galashin.lesson_8.level_5.task_26;


class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
