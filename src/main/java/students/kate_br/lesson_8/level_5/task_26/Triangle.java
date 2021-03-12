package students.kate_br.lesson_8.level_5.task_26;

 class Triangle extends Shape {

     public double side;

     public Triangle(String title, double side) {
         super(title);
         this.side = side;
     }

     @Override
     double calculateArea() {
         double r = (side + side + side) / 2;
         return r * 2;
     }

     @Override
     double calculatePerimeter() {
         return side * 3;
     }
 }

