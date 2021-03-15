package students.deniss_jankovskis.lesson_8.level_5.task_24;

class Triangle extends Shape {

    public double sideA, sideB, sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
                '}';
    }
}
