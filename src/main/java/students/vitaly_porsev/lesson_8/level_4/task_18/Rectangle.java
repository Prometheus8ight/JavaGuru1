package students.vitaly_porsev.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private double width, height;

    public Rectangle(String title, double width, double height) {
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