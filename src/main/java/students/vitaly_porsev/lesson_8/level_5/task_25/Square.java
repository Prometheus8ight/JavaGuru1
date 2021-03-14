package students.vitaly_porsev.lesson_8.level_5.task_25;

class Square extends Shape {

    private double sideA, sideB, SideC, SideD;

    public Square(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.SideC = sideA;
        this.SideD = sideA;
    }

    @Override
    double calculateArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    double calculatePerimeter() {
        return getSide() * 4;
    }

    public double getSide() {
        return sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", SideC=" + SideC +
                ", SideD=" + SideD +
                '}';
    }
}