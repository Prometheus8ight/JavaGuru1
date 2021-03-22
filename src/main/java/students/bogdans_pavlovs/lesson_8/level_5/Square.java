package students.bogdans_pavlovs.lesson_8.level_5;

class Square extends Shape {

    private double side;

    Square(double side){
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {

        return side * 4;

    }

}
