package students.rodion_afanasjev.lesson_3.level_7.task_29;

class Circle {

    double rad;

    Circle(double radius){
        rad = radius;
    }

    double calculateArea(){
        return Math.PI * rad * rad;
    }
}
