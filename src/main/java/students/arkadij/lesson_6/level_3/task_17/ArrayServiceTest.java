package students.arkadij.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {

    public void allTests(){
        sortArr();
    }

    private void checkSortTest(int[] expectedResult, int[] realResult, String nameTest){
        if (Arrays.equals(expectedResult, realResult)){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void sortArr(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {20,10,5,15};
        int[] expectedResult = {5,10,15,20};
        arrayService.sort(arr);
        checkSortTest(expectedResult, arr, "Sorting array test");
    }

}
