package students.kate_br.lesson_6.level_3.task_13;

 class ArrayServiceTest {

     public static void main(String[] args) {

         ArrayServiceTest test = new ArrayServiceTest();
         test.findPositiveNumber(new int[]{1, 2, 3, 3}, 3);
         test.notFindNumber(new int[]{1, 2, 3, 3}, 5);
         test.findNegativeNumber(new int[]{-1, -2, -3, -3}, -3);
         test.findZero(new int[]{1, 2, 3, 0, 4, 0}, 0);

     }

     public void findPositiveNumber(int[] arr, int numberToSearch){

         ArrayService service = new ArrayService();
         int realResult = service.countOccurrences(arr, numberToSearch);
         checkTestResult(2, realResult, "PositiveNumber");
     }

     public void notFindNumber(int[] arr, int numberToSearch){

         ArrayService service = new ArrayService();
         int realResult = service.countOccurrences(arr, numberToSearch);
         checkTestResult(2, realResult, "FalseTest");

     }

     public void findNegativeNumber(int[] arr, int numberToSearch){

         ArrayService service = new ArrayService();
         int realResult = service.countOccurrences(arr, numberToSearch);
         checkTestResult(2, realResult, "NegativeNumber");
     }

     public void findZero(int[] arr, int numberToSearch){

         ArrayService service = new ArrayService();
         int realResult = service.countOccurrences(arr, numberToSearch);
         checkTestResult(2, realResult, "ZeroNumber");
     }


     private void checkTestResult(int expectedResult, int realResult, String testName){
         if (realResult == expectedResult){
             System.out.println(testName + ": Test OK");
         }else {
             System.out.println(testName + ": Test FAIL");
         }
     }
}
