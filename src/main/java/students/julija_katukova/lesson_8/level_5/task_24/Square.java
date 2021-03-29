package students.julija_katukova.lesson_8.level_5.task_24;

class Square extends Shape {

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
    double calculatePerimeter() {
        return side * 4;
    }
}
