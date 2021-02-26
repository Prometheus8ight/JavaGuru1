package students.kate_br.lesson_6.level_3.task_14;


 class ArrayServiceTest {

     public static void main(String[] args) {

         ArrayServiceTest test = new ArrayServiceTest();
         test.trueNumber(new int[]{3, 4, 3, 2, 1}, 3, 5);
         test.negativeNumber(new int[]{-2, -2, -3, -4, -5}, -2, -1);
         test.falseNumber(new int[]{1, 2, 3, 4, 5, 6, 7}, 1, 3);

     }

     public void trueNumber(int[] arr, int numberToReplace, int newNumber){

         ArrayService service = new ArrayService();
         boolean realResult = service.replaceFirst(arr, numberToReplace, newNumber);
         checkTestResult(realResult, true, "TrueNumberTest");

     }

     public void negativeNumber(int[] arr, int numberToReplace, int newNumber){

         ArrayService service = new ArrayService();
         boolean realResult = service.replaceFirst(arr, numberToReplace, newNumber);
         checkTestResult(realResult, true, "NegativeNumberTest");
     }

     public void falseNumber(int[] arr, int numberToReplace, int newNumber){

         ArrayService service = new ArrayService();
         boolean realResult = service.replaceFirst(arr, numberToReplace, newNumber);
         checkTestResult(realResult, false, "FalseNumberTest");
     }

     private void checkTestResult(boolean realResult, boolean expectedResult, String testName){

         if(realResult == expectedResult){
             System.out.println(testName + ": Test OK");
         }else {
             System.out.println(testName + ": Test FAIL");
         }
     }
}
