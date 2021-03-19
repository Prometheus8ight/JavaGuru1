package students.deniss_jankovskis.lesson_8.level_5.task_25;

class Square extends Shape {

    public double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

}
