package students.bogdans_pavlovs.lesson_8.level_5;

class Circle extends Shape {

    private double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;

    }
}
