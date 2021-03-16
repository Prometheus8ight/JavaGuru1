package students.vitaly_porsev.lesson_8.level_5.task_24;

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                '}';
    }
}