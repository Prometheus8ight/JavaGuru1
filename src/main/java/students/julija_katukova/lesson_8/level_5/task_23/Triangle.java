package students.julija_katukova.lesson_8.level_5.task_23;

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {//по формуле Герона
        return Math.sqrt((0.5 * calculatePerimeter()) * ((0.5 * calculatePerimeter()) - sideA) * ((0.5 * calculatePerimeter()) - sideB) * ((0.5 * calculatePerimeter()) - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}