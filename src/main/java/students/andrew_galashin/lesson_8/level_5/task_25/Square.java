package students.andrew_galashin.lesson_8.level_5.task_25;

class Square extends Shape {

    private double x;

    Square(double x) {
        this.x = x;
    }

    @Override
    double calculateArea() {
        return x * x;
    }

    @Override
    double calculatePerimeter() {
        return x * 4;
    }
}
