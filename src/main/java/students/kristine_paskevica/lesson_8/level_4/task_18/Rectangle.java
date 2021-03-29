package students.kristine_paskevica.lesson_8.level_4.task_18;

 class Rectangle extends Shape{

     private double a;
     private double b;

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
