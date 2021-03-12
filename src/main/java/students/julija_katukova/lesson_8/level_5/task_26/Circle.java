package students.julija_katukova.lesson_8.level_5.task_26;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}