package students.rodion_afanasjev.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private double side;

    Triangle(String title, double side){
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    double calculatePerimeter() {
        return side + side + side;
    }
}
