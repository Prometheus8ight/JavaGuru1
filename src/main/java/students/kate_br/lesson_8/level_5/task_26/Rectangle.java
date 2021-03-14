package students.kate_br.lesson_8.level_5.task_26;

 class Rectangle extends Shape {

     private double sideA, sideB;

     public Rectangle(String title, double sideA, double sideB) {
         super(title);
         this.sideA = sideA;
         this.sideB = sideB;
     }

     @Override
     double calculateArea() {
         return sideA * sideB;
     }

     @Override
     double calculatePerimeter() {
         return (sideA + sideB) * 2;
     }
 }
