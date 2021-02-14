package students.lolita_polakova.lesson_3.level_7.task_29;

class Circle {

    double radius;

    Circle(double circleRadius) {
        this.radius = circleRadius;
    }

    public void radiusInfo() {
        System.out.println("Circle radius: " + this.radius);
    }

    double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
        return area;
    }
}

class CircleDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.radiusInfo();
        circle.calculateArea();
    }
}