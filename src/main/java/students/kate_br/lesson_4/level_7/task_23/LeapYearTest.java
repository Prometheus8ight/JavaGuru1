package students.kate_br.lesson_4.level_7.task_23;

 class LeapYearTest{
     public static void main(String[] args) {

         LeapYearTest test = new LeapYearTest();
         test.isNotLeapYearTest(2021);
         test.isLeapYearTest(2020);


     }

     public void isNotLeapYearTest(int year){

         year = 2021;
         boolean expectedResult = false;
         LeapYear leapYear = new LeapYear();
         boolean realResult = leapYear.isLeapYear(year);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }

     }

     public void isLeapYearTest(int year){

         year = 2020;
         boolean expectedResult = true;
         LeapYear leapYear = new LeapYear();
         boolean realResult = leapYear.isLeapYear(year);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }


}
