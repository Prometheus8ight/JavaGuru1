package students.kristine_paskevica.lesson_8.level_5.task_26;

class Triangle extends Shape {

     private double trijstMala;

     Triangle(String title, double trijstMala) {
         super(title);
         this.trijstMala = trijstMala;

     }

     @Override
     double calculateArea() {
         return (Math.pow(trijstMala, 2) * Math.sqrt(3)) / 4;    //vienādmalu trijstūra laukuma formula
     }

     @Override
     double calculatePerimeter() {

         return trijstMala + trijstMala + trijstMala;
     }
}
