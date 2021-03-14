package students.vitaly_porsev.lesson_8.level_5.task_21;

class Square {

    private double sideA, sideB, SideC, SideD;

    public Square(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.SideC = sideA;
        this.SideD = sideA;
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