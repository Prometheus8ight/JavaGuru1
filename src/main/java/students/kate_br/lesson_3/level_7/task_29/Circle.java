package students.kate_br.lesson_3.level_7.task_29;

 class Circle {

     double radius;

     Circle(double radius){

         this.radius = radius;
     }

     double calculateArea(){
         double area = Math.PI * (this.radius * this.radius);
         System.out.println(area);
         return area;

     }
}
