package students.pavels_steinbors.lesson_3.level_7.task_29;

class Circle {

    double r;

    Circle(double radius) {
        this.r = radius;
    }

    double calculateArea() {
        double area = Math.PI * r * r;
        System.out.println("Circle area is: " + area);
        return area;
    }

}
