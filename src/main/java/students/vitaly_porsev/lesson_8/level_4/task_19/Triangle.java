package students.vitaly_porsev.lesson_8.level_4.task_19;

public class Triangle extends Shape {

    private double sideA, sideB, sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}