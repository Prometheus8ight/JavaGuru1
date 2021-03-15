package students.deniss_jankovskis.lesson_8.level_5.task_26;

class Rectangle extends Shape {

    public double width;
    public double height;

    Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }

}
