package students.arkadij.lesson_6.level_3.task_15;

class ArrayServiceTest {

    public void allTests(){
        threeNumberReplacedTest();
        twoNumberReplacedTest();
        noneNumberReplacedTest();
    }

    private void numbersToReplaceCheck(int expectedResult, int realResult, String nameTest){
        if (expectedResult == realResult){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void threeNumberReplacedTest(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,33,4,33,6,33};
        numbersToReplaceCheck(3,
                arrayService.replaceAll(arr,33,57),
                "Found & replaced three numbers");
    }

    public void twoNumberReplacedTest(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {22,3,22,5,10};
        numbersToReplaceCheck(2,
                arrayService.replaceAll(arr, 22,7),
                "Found & replaced two numbers");
    }

    public void noneNumberReplacedTest(){
        System.out.println("\nNONE NUMBERS TO REPLACE:");
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5};
        numbersToReplaceCheck(0,
                arrayService.replaceAll(arr,8,22),
                "Test");
    }

}
