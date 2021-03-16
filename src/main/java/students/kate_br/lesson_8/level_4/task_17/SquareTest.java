package students.kate_br.lesson_8.level_4.task_17;

 class SquareTest {

     public static void main(String[] args) {

         SquareTest test = new SquareTest();
         test.areaTest();
         test.perimeterTest();
     }

     public void areaTest(){

         Shape square = new Square("Square", 5);
         double realResult = square.calculateArea();
         checkTestResult(realResult, 25.0, "Area test");
     }

     public void perimeterTest(){

         Shape square = new Square("Square", 5);
         double realResult = square.calculatePerimeter();
         checkTestResult(realResult, 20.0, "Perimeter test");
     }

     private void checkTestResult(double realResult, double expectedResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + ": OK");
         }else {
             System.out.println(testName + ": FAIL");
         }
     }
 }
