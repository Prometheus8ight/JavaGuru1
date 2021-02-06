package students.julija_katukova.lesson_3.level_7.task_29;

class Circle {
    double radius;

    Circle(double circleRadius){
        this.radius = circleRadius;
    }

    double calculateArea(){
        double area = Math.PI * (this.radius * this.radius);
        System.out.println(area);
        return area;

    }



}
