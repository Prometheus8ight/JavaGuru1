package students.andrew_galashin.lesson_8.level_5.task_27;

class Triangle extends Shape {

    private double a;
    private double h;

    Triangle(String title, double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    double calculateArea() {
        return 0.5 * a * h;
    }

    @Override
    double calculatePerimeter() {
        return a * 3;
    }
}
