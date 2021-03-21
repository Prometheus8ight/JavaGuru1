package students.bogdans_pavlovs.lesson_8.level_5;

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width){

        this.length = length;
        this.width = width;

    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {

        return (length * 2) + (width * 2);

    }


}
