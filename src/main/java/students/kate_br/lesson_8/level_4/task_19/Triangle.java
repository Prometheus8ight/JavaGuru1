package students.kate_br.lesson_8.level_4.task_19;

 class Triangle extends Shape {

     private double a, b, c;

     public Triangle(String title, double a, double b, double c) {
         super(title);
         this.a = a;
         this.b = b;
         this.c = c;
     }

     @Override
     double calculateArea() {
         double p = (a + b + c) / 2;
         return p * 2;
     }

     @Override
     double calculatePerimeter() {
         return a + b + c;
     }
 }
