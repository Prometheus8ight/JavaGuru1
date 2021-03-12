package students.vitaly_porsev.lesson_8.level_5.task_24;

class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side +
                '}';
    }
}