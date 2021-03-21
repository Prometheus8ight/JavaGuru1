package students.bogdans_pavlovs.lesson_8.level_4.task_17;

class Square extends Shape{

    private double side;

    Square(String title, double side) {

        super(title);
        this.side = side;

    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimiter() {
        return side * 4;
    }
}
