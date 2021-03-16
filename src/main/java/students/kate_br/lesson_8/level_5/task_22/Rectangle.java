package students.kate_br.lesson_8.level_5.task_22;

 class Rectangle extends Shape {

     private double a, b;

     public Rectangle(String title, double a, double b) {
         super(title);
         this.a = a;
         this.b = b;
     }

     @Override
     double calculateArea() {
         return a * b;
     }

     @Override
     double calculatePerimeter() {
         return (a + b) * 2;
     }
 }
