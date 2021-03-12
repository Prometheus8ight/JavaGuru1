package students.kate_br.lesson_8.level_5.task_26;

 class Circle extends Shape {

     public Circle(String title, double radius) {
         super(title);
         this.radius = radius;
     }

     private double radius;
     @Override
     double calculateArea() {
         return Math.PI * radius * radius;
     }

     @Override
     double calculatePerimeter() {
         return 2 * Math.PI * radius;
     }
 }
