package students.alex_kalashnikov.lesson_8.level_5.task_27;

class Triangle extends Shape {

    protected double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) * (sideLength * sideLength) / 2;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }

}