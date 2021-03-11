package instructor.lesson_8.abstraction;

class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return height * width;
    }
}
