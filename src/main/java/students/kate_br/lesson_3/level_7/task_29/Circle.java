package students.kate_br.lesson_3.level_7.task_29;

 class Circle {

     double radius;

     Circle(double radius){
         this.radius = radius;
     }

     void calculateArea(){
         double pi = 3.14;
         System.out.println("Circle area is " + (pi * (this.radius * this.radius)));
     }
}
