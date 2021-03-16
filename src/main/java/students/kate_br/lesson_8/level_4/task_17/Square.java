package students.kate_br.lesson_8.level_4.task_17;

 class Square extends Shape {

     private double a;

     public Square(String title, double a) {
         super(title);
         this.a = a;
     }

     @Override
     double calculateArea() {
         return a * a;
     }

     @Override
     double calculatePerimeter() {
         return a * 4;
     }
 }
