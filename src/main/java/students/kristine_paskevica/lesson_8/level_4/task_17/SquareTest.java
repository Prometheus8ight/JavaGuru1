package students.kristine_paskevica.lesson_8.level_4.task_17;

 class SquareTest {
     public static void main(String[] args) {

         SquareTest test = new SquareTest();
         test.areaTest();
         test.perimeterTest();
     }

     public void areaTest(){

         Shape square = new Square("Square", 5);
         double realResult = square.calculateArea();
         checkTestResult(realResult, 25.0, "Laukuma tests");
     }

     public void perimeterTest(){

         Shape square = new Square("Square", 25);
         double realResult = square.calculatePerimeter();
         checkTestResult(realResult, 10.0, "Perimetra tests");
     }

     private void checkTestResult(double realResult, double expectedResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + ": ir patiess");
         }else {
             System.out.println(testName + ": nav patiess");
         }
     }
}
