package students.bogdans_pavlovs.lesson_8.level_5;

class Triangle extends Shape {

    private double side;
    private double base;
    private double height;

    Triangle(double side, double base, double height){

        this.side = side;
        this.base = base;
        this.height = height;

    }

    double calculateArea() {
        return (base * height) / 2 ;
    }

    double calculatePerimeter() {

        return (side * 2) + base;

    }


}
