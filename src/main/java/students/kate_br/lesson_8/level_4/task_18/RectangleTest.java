package students.kate_br.lesson_8.level_4.task_18;

 class RectangleTest {

     public static void main(String[] args) {
         RectangleTest test = new RectangleTest();
         test.areaTest();
         test.perimeterTest();
         test.areaFailTest();
         test.perimeterFailTest();
     }

     public void areaTest(){

         Shape rectangle = new Rectangle("Rectangle", 5, 2);
         double realResult = rectangle.calculateArea();
         checkTestResult(realResult, 10.0, "Area test");
     }

     public void areaFailTest(){

         Shape rectangle = new Rectangle("Rectangle", 4, 3);
         double realResult = rectangle.calculateArea();
         checkTestResult(realResult, 15.0, "Area fail test");
     }

     public void perimeterTest(){

         Shape rectangle = new Rectangle("Rectangle", 5, 2);
         double realResult = rectangle.calculatePerimeter();
         checkTestResult(realResult, 14.0, "Perimeter test");
     }

     public void perimeterFailTest(){

         Shape rectangle = new Rectangle("Rectangle", 4, 2);
         double realResult = rectangle.calculatePerimeter();
         checkTestResult(realResult, 26.0, "Perimeter fail test");
     }



     private void checkTestResult(double realResult, double expectedResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + ": OK");
         }else {
             System.out.println(testName + ": FAIL");
         }
     }
}
