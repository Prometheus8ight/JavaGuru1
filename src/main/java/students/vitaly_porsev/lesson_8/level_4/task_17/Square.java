package students.vitaly_porsev.lesson_8.level_4.task_17;

class Square extends Shape {

    private double sideA, sideB, SideC, SideD;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideA;
        this.SideC = sideA;
        this.SideD = sideA;
    }

    @Override
    double calculateArea() {
        return Math.pow(getSideA(), 2);
    }

    @Override
    double calculatePerimeter() {
        return getSideA() * 4;
    }

    public double getSideA() {
        return sideA;
    }
}