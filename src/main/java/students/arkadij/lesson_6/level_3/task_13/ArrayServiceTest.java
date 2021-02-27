package students.arkadij.lesson_6.level_3.task_13;

class ArrayServiceTest {

    public void allTests(){
        numbersCheckOne();
        numbersCheckTwo();
        numbersCheckThree();
    }

    private void numbersToCheck(int expectedResult, int realResult, String nameTest){
        if (expectedResult == realResult){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void numbersCheckOne(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5};
        numbersToCheck(0,
                arrayService.countOccurrences(arr,3),
                "The number is not in the array"); // Going to be FAIL!
    }

    public void numbersCheckTwo(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,4,5,3,33,55};
        numbersToCheck(2,
                arrayService.countOccurrences(arr, 3),
                "Found two numbers in the array");
    }

    public void numbersCheckThree(){
        ArrayService arrayService = new ArrayService();
        int[] arr = {1,2,3,22,3,55,4,3,5};
        numbersToCheck(3,
                arrayService.countOccurrences(arr, 3),
                "Found three numbers in the array");
    }

}
