package students.vitaly_porsev.lesson_8.level_5.task_24;

class Triangle extends Shape {

    private double SideA, SideB, SideC;

    public Triangle(double sideA, double sideB, double sideC) {
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "SideA = " + SideA +
                ", SideB = " + SideB +
                ", SideC = " + SideC +
                '}';
    }
}