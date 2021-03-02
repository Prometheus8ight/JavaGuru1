package students.darja_scavrovica.lesson_5.level_5.task_31;

class ArraysTest {
     public static void main(String[] args) {
         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();
         test.findMax();
         test.findMin();
     }

     public void shouldCreateArray() {

         int expectedResult = 10;
         Arrays arrays = new Arrays();
         int realResult = arrays.create(10).length;
         check(realResult, expectedResult,"shouldCreateArray");
         }

         public void findMax() {

            int expectedResult = 120;
            int [] array = {120,60,90,10};
            Arrays arrays = new Arrays();
            int realResult = arrays.findMax(array);
            check(realResult, expectedResult,"findMax");
         }
         public void findMin() {

            int expectedResult = 10;
            int [] array = {120,60,90,10};
            Arrays arrays = new Arrays();
            int realResult = arrays.findMin(array);
            check(realResult, expectedResult,"findMin");
         }


     public void check (int realResult, int expectedResult,String testName){
         if (realResult == expectedResult){
             System.out.println(testName + " = TRUE");
         } else {
             System.out.println(testName + " = FAlSE");
         }
     }
 }

