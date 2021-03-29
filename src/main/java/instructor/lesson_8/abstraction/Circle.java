package instructor.lesson_8.abstraction;

class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
