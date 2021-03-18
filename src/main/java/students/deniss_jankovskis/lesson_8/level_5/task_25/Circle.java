package students.deniss_jankovskis.lesson_8.level_5.task_25;

class Circle extends Shape {


    public double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
