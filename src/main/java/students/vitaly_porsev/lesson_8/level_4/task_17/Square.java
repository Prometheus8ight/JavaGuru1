package students.vitaly_porsev.lesson_8.level_4.task_17;

class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
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
        return side;
    }
}