package students.bogdans_pavlovs.lesson_3.level_7.task_29;

class Circle {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    //Методы: расчет площади (double calculateArea()).

    double circleArea(){

        double area = radius * radius * Math.PI;
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        return area;

    }

}



