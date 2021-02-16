package students.kristine_paskevica_lesson_4.level_7.task23;

 class LeapYearDemo {

     public static void main(String[] args) {
         LeapYear garaisIsaisGads = new LeapYear();

         Boolean simtsGadi = garaisIsaisGads.isLeapYear(100);
         System.out.println(simtsGadi);

         Boolean cetriGadi = garaisIsaisGads.isLeapYear(4);
         System.out.println(cetriGadi);

         Boolean cetriSimtsGadi = garaisIsaisGads.isLeapYear(400);
         System.out.println(cetriSimtsGadi);

     }
}
