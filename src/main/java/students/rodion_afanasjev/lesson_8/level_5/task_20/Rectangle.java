package students.rodion_afanasjev.lesson_8.level_5.task_20;

class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String title, double width, double height){
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
        return (width + height) *2;
    }

}
