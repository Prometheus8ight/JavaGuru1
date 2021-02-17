package students.kristine_paskevica_lesson_4.level_7.task23;

 class LeapYearTest {

     public static void main(String[] args) {

         LeapYearTest isaisGaraisGads = new LeapYearTest();
         isaisGaraisGads.testsPirmais();
     }
     public void testsPirmais() {

         LeapYear isaisGaraisTests = new LeapYear();
         boolean realaisRezult = isaisGaraisTests.isLeapYear(6);
         if (!realaisRezult) {
             System.out.println("1. tests ir precīzss");
         } else {
             System.out.println("1. tests nav precīzs");
         }
         LeapYearTest isaisGaraisGads = new LeapYearTest();
         isaisGaraisGads.testsOtrais();
     }
     public void testsOtrais() {
         LeapYear isaisGaraisTests = new LeapYear();
         boolean realaisRezult = isaisGaraisTests.isLeapYear(4);
         if (!realaisRezult) {
             System.out.println("2. tests nav precīzss");
         } else {
             System.out.println("2. tests ir precīzs");
         }
         LeapYearTest isaisGaraisGads = new LeapYearTest();
         isaisGaraisGads.testsTresais();
     }
     public void testsTresais(){
        LeapYear isaisGaraisTests = new LeapYear();
        boolean realaisRezult = isaisGaraisTests.isLeapYear(100);
         if (!realaisRezult) {
            System.out.println("3. tests ir precīzss");
         } else {
            System.out.println("3. tests nav precīzs");
     }
         LeapYearTest isaisGaraisGads = new LeapYearTest();
         isaisGaraisGads.testsCeturtais();
     }
     public void testsCeturtais(){
         LeapYear isaisGaraisTests = new LeapYear();
         boolean realaisRezult = isaisGaraisTests.isLeapYear(400);
         if (!realaisRezult) {
             System.out.println("4. tests nav precīzs");
         } else {
             System.out.println("4. tests ir precīzs");
         }
     }
}
