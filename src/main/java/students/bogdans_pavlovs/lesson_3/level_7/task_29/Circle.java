package students.bogdans_pavlovs.lesson_3.level_7.task_29;

class Circle {

    double radius;
    double area;
    double pi;

    Circle(double radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }

    void circleArea (){

        area = radius * radius * pi;
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);

    }

}
