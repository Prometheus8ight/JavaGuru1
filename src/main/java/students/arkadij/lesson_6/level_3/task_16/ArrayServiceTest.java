package students.arkadij.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceTest {

    public void allTests(){
        revertTests();
    }

    public void checkRevertTest(int[] expectedResult, int[] realResult, String nameTest){
        if (Arrays.equals(expectedResult, realResult)){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void revertTests(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3};
        int[] expectedResult = {3,2,1};
        arrayService.revert(arr);
        checkRevertTest(expectedResult, arr, "Revert array test");
    }

}
