package students.vitaly_porsev.lesson_8.level_5.task_24;

class Rectangle extends Shape {

    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                '}';
    }
}