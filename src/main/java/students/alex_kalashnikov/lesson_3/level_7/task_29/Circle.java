package students.alex_kalashnikov.lesson_3.level_7.task_29;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double result = Math.PI * radius * radius;
        System.out.print("Circle Area is " + result);
        return result;

    }

}
