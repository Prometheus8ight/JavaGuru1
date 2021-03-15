package students.deniss_jankovskis.lesson_8.level_5.task_24;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                '}';
    }
}
