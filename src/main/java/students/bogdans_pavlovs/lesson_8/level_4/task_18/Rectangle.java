package students.bogdans_pavlovs.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(String title, double length, double width){

        super(title);
        this.length = length;
        this.width = width;

    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimiter() {
        return length * 2 + width * 2;
    }

}
