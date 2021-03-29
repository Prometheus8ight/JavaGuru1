package students.kate_br.lesson_6.level_3.task_16;

import java.util.Arrays;


class ArrayServiceTest {

     public static void main(String[] args) {

         ArrayServiceTest test = new ArrayServiceTest();
         test.posNumTest(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
         test.failNumTest(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 1, 2, 3});
         test.negNumTest(new int[]{-1, -2, -3, -4, -5}, new int[]{-5, - 4, -3, -2, -1});
     }

     public void posNumTest(int[] arr, int[] rev) {

         ArrayService service = new ArrayService();
         service.revert(arr);
         checkTestResult(Arrays.equals(arr, rev), "Positive number test");
     }

     public void failNumTest(int[] arr, int[] rev){

         ArrayService service = new ArrayService();
         service.revert(arr);
         checkTestResult(Arrays.equals(arr, rev), "Fail number test");
     }

     public void negNumTest(int[] arr, int[] rev){

         ArrayService service = new ArrayService();
         service.revert(arr);
         checkTestResult(Arrays.equals(arr, rev), "Negative number test");
     }

     private void checkTestResult(boolean condition, String testName){

         if (condition){
             System.out.println(testName + ": Test OK");
         }else {
             System.out.println(testName + ": Test FAIL");
         }

     }


}
