package students.kristine_paskevica.lesson_8.level_5;

class Circle extends Shape{

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
