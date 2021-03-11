package instructor.lesson_8.abstraction;

class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public double area() {
        return side * side;
    }

    public void foo() {

    }
}
