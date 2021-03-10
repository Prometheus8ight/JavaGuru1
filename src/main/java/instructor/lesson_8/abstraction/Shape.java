package instructor.lesson_8.abstraction;

abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract public String name();
    abstract public double area();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name() + "\'" +
                ",area='" + area() + "\'" +
                ",color='" + color + "\'" +
                "}";
    }
}
